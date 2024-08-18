package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Shield-checkered-fill`: ImageVector
    get() {
        if (`_shield-checkered-fill` != null) {
            return `_shield-checkered-fill`!!
        }
        `_shield-checkered-fill` = Builder(name = "Shield-checkered-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 40.0f)
                horizontalLineTo(48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 56.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 52.72f, 25.52f, 84.67f, 46.93f, 102.19f)
                curveToRelative(23.06f, 18.86f, 46.0f, 25.27f, 47.0f, 25.53f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.2f, 0.0f)
                curveToRelative(1.0f, -0.26f, 23.91f, -6.67f, 47.0f, -25.53f)
                curveTo(198.48f, 196.67f, 224.0f, 164.72f, 224.0f, 112.0f)
                verticalLineTo(56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 40.0f)
                close()
                moveTo(128.0f, 223.62f)
                arcToRelative(128.25f, 128.25f, 0.0f, false, true, -38.92f, -21.81f)
                curveTo(65.83f, 182.79f, 52.37f, 158.0f, 48.9f, 128.0f)
                horizontalLineTo(128.0f)
                verticalLineTo(56.0f)
                horizontalLineToRelative(80.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(141.24f, 141.24f, 0.0f, false, true, -0.9f, 16.0f)
                horizontalLineTo(128.0f)
                verticalLineToRelative(95.62f)
                close()
            }
        }
        .build()
        return `_shield-checkered-fill`!!
    }

private var `_shield-checkered-fill`: ImageVector? = null
