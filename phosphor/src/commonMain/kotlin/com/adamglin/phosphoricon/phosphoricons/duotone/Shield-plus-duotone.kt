package com.adamglin.phosphoricon.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.DuotoneGroup

public val DuotoneGroup.`Shield-plus-duotone`: ImageVector
    get() {
        if (`_shield-plus-duotone` != null) {
            return `_shield-plus-duotone`!!
        }
        `_shield-plus-duotone` = Builder(name = "Shield-plus-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 56.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 96.0f, -88.0f, 120.0f, -88.0f, 120.0f)
                reflectiveCurveTo(40.0f, 208.0f, 40.0f, 112.0f)
                verticalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(208.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 56.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(24.0f)
                lineTo(120.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(136.0f, 136.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(120.0f, 136.0f)
                lineTo(96.0f, 136.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 88.0f, 128.0f)
                close()
                moveTo(224.0f, 56.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 52.72f, -25.52f, 84.67f, -46.93f, 102.19f)
                curveToRelative(-23.06f, 18.86f, -46.0f, 25.27f, -47.0f, 25.53f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.2f, 0.0f)
                curveToRelative(-1.0f, -0.26f, -23.91f, -6.67f, -47.0f, -25.53f)
                curveTo(57.52f, 196.67f, 32.0f, 164.72f, 32.0f, 112.0f)
                lineTo(32.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 40.0f)
                lineTo(208.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 56.0f)
                close()
                moveTo(208.0f, 56.0f)
                lineTo(48.0f, 56.0f)
                lineToRelative(0.0f, 56.0f)
                curveToRelative(0.0f, 37.3f, 13.82f, 67.51f, 41.07f, 89.81f)
                arcTo(128.25f, 128.25f, 0.0f, false, false, 128.0f, 223.62f)
                arcToRelative(129.3f, 129.3f, 0.0f, false, false, 39.41f, -22.2f)
                curveTo(194.34f, 179.16f, 208.0f, 149.07f, 208.0f, 112.0f)
                close()
            }
        }
        .build()
        return `_shield-plus-duotone`!!
    }

private var `_shield-plus-duotone`: ImageVector? = null
