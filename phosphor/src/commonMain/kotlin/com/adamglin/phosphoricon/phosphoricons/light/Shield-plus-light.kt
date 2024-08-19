package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Shield-plus-light`: ImageVector
    get() {
        if (`_shield-plus-light` != null) {
            return `_shield-plus-light`!!
        }
        `_shield-plus-light` = Builder(name = "Shield-plus-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(166.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(134.0f, 134.0f)
                verticalLineToRelative(26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(122.0f, 134.0f)
                lineTo(96.0f, 134.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(26.0f)
                lineTo(122.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(26.0f)
                horizontalLineToRelative(26.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 166.0f, 128.0f)
                close()
                moveTo(222.0f, 56.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 51.94f, -25.12f, 83.4f, -46.2f, 100.64f)
                curveToRelative(-22.73f, 18.6f, -45.27f, 24.89f, -46.22f, 25.15f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.16f, 0.0f)
                curveToRelative(-1.0f, -0.26f, -23.49f, -6.55f, -46.22f, -25.15f)
                curveTo(59.12f, 195.4f, 34.0f, 163.94f, 34.0f, 112.0f)
                lineTo(34.0f, 56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 48.0f, 42.0f)
                lineTo(208.0f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 222.0f, 56.0f)
                close()
                moveTo(210.0f, 56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(48.0f, 54.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 37.75f, 13.94f, 68.39f, 41.44f, 91.06f)
                arcTo(130.83f, 130.83f, 0.0f, false, false, 128.0f, 225.72f)
                arcToRelative(131.06f, 131.06f, 0.0f, false, false, 40.56f, -22.66f)
                curveTo(196.06f, 180.39f, 210.0f, 149.75f, 210.0f, 112.0f)
                close()
            }
        }
        .build()
        return `_shield-plus-light`!!
    }

private var `_shield-plus-light`: ImageVector? = null
