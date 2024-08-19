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

public val FillGroup.`Flag-fill`: ImageVector
    get() {
        if (`_flag-fill` != null) {
            return `_flag-fill`!!
        }
        `_flag-fill` = Builder(name = "Flag-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 56.0f)
                verticalLineTo(176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.76f, 6.0f)
                curveToRelative(-15.28f, 13.23f, -29.89f, 18.0f, -43.82f, 18.0f)
                curveToRelative(-18.91f, 0.0f, -36.57f, -8.74f, -53.0f, -16.85f)
                curveTo(105.87f, 170.0f, 82.79f, 158.61f, 56.0f, 179.77f)
                verticalLineTo(224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.77f, -6.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(36.0f, -31.18f, 68.31f, -15.21f, 96.79f, -1.12f)
                curveTo(167.0f, 62.46f, 190.79f, 74.2f, 218.76f, 50.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 56.0f)
                close()
            }
        }
        .build()
        return `_flag-fill`!!
    }

private var `_flag-fill`: ImageVector? = null
