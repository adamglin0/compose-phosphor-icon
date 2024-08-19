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

public val FillGroup.`Eye-fill`: ImageVector
    get() {
        if (`_eye-fill` != null) {
            return `_eye-fill`!!
        }
        `_eye-fill` = Builder(name = "Eye-fill", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(247.31f, 124.76f)
                curveToRelative(-0.35f, -0.79f, -8.82f, -19.58f, -27.65f, -38.41f)
                curveTo(194.57f, 61.26f, 162.88f, 48.0f, 128.0f, 48.0f)
                reflectiveCurveTo(61.43f, 61.26f, 36.34f, 86.35f)
                curveTo(17.51f, 105.18f, 9.0f, 124.0f, 8.69f, 124.76f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 6.5f)
                curveToRelative(0.35f, 0.79f, 8.82f, 19.57f, 27.65f, 38.4f)
                curveTo(61.43f, 194.74f, 93.12f, 208.0f, 128.0f, 208.0f)
                reflectiveCurveToRelative(66.57f, -13.26f, 91.66f, -38.34f)
                curveToRelative(18.83f, -18.83f, 27.3f, -37.61f, 27.65f, -38.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 247.31f, 124.76f)
                close()
                moveTo(128.0f, 168.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 40.0f, -40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 128.0f, 168.0f)
                close()
            }
        }
        .build()
        return `_eye-fill`!!
    }

private var `_eye-fill`: ImageVector? = null
