package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Shield-fill`: ImageVector
    get() {
        if (`_shield-fill` != null) {
            return `_shield-fill`!!
        }
        `_shield-fill` = Builder(name = "Shield-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 56.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 52.72f, -25.52f, 84.67f, -46.93f, 102.19f)
                curveToRelative(-23.06f, 18.86f, -46.0f, 25.27f, -47.0f, 25.53f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.2f, 0.0f)
                curveToRelative(-1.0f, -0.26f, -23.91f, -6.67f, -47.0f, -25.53f)
                curveTo(57.52f, 196.67f, 32.0f, 164.72f, 32.0f, 112.0f)
                verticalLineTo(56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 40.0f)
                horizontalLineTo(208.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 56.0f)
                close()
            }
        }
        .build()
        return `_shield-fill`!!
    }

private var `_shield-fill`: ImageVector? = null
