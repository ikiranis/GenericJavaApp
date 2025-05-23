<script setup lang="ts">
import {language} from "@/functions/languageStore.ts";
import {computed, ComputedRef} from "vue";
import {useRoute} from "vue-router";
import LanguageSelect from "@/components/utilities/LanguageSelect.vue";

const route = useRoute()

const props = defineProps({
    collapsed: {
        type: Boolean,
        required: true
    }
})

/**
 * Check if the current page is the same as the given page
 *
 * @param page
 */
const checkCurrentPage = (page: string): string => {
    return route.name === page ? 'currentPage' : ''
}

/**
 * Compute the classes for the menu items
 */
const menuItemClasses: ComputedRef<string> = computed(() => {
    const classes = 'd-flex '

    if (props.collapsed) {
        return classes + 'justify-content-center'
    }

    return classes + 'justify-content-start'
})

/**
 * Compute the icon size if collapsed or not
 */
const getIconSize: ComputedRef<number> = computed(() => {
    return props.collapsed ? 42 : 24
})
</script>

<template>
    <div>
        <div>
            <router-link :to="{ name: 'Home' }" title="Home" :class="menuItemClasses">
                <h2 class="d-flex">
                    <span>
                        <svg xmlns="http://www.w3.org/2000/svg" :width="getIconSize + 8" fill="white"
                             class="bi bi-house-door-fill my-auto" viewBox="0 0 16 16">
                            <path
                                d="M6.5 14.5v-3.505c0-.245.25-.495.5-.495h2c.25 0 .5.25.5.5v3.5a.5.5 0 0 0 .5.5h4a.5.5 0 0 0 .5-.5v-7a.5.5 0 0 0-.146-.354L13 5.793V2.5a.5.5 0 0 0-.5-.5h-1a.5.5 0 0 0-.5.5v1.293L8.354 1.146a.5.5 0 0 0-.708 0l-6 6A.5.5 0 0 0 1.5 7.5v7a.5.5 0 0 0 .5.5h4a.5.5 0 0 0 .5-.5Z"/>
                        </svg>
                    </span>

                    <span class="mx-3" v-if="!collapsed">Generic</span>
                </h2>
            </router-link>
            <router-link :to="{ name: 'Settings' }"
                         :class="checkCurrentPage('Settings') + ' ' + menuItemClasses"
                         :title="language.get('Settings')">
                <span>
                    <svg xmlns="http://www.w3.org/2000/svg" :width="getIconSize" fill="currentColor"
                         class="bi bi-gear-fill" viewBox="0 0 16 16">
                        <path
                            d="M9.405 1.05c-.413-1.4-2.397-1.4-2.81 0l-.1.34a1.464 1.464 0 0 1-2.105.872l-.31-.17c-1.283-.698-2.686.705-1.987 1.987l.169.311c.446.82.023 1.841-.872 2.105l-.34.1c-1.4.413-1.4 2.397 0 2.81l.34.1a1.464 1.464 0 0 1 .872 2.105l-.17.31c-.698 1.283.705 2.686 1.987 1.987l.311-.169a1.464 1.464 0 0 1 2.105.872l.1.34c.413 1.4 2.397 1.4 2.81 0l.1-.34a1.464 1.464 0 0 1 2.105-.872l.31.17c1.283.698 2.686-.705 1.987-1.987l-.169-.311a1.464 1.464 0 0 1 .872-2.105l.34-.1c1.4-.413 1.4-2.397 0-2.81l-.34-.1a1.464 1.464 0 0 1-.872-2.105l.17-.31c.698-1.283-.705-2.686-1.987-1.987l-.311.169a1.464 1.464 0 0 1-2.105-.872l-.1-.34zM8 10.93a2.929 2.929 0 1 1 0-5.86 2.929 2.929 0 0 1 0 5.858z"/>
                    </svg>
                </span>

                <span class="mx-2" v-if="!collapsed">{{ language.get("Settings") }}</span>
            </router-link>
        </div>

        <div class="mt-auto d-flex justify-content-center mb-3">
            <language-select :collapsed="collapsed"/>
        </div>
    </div>
</template>



