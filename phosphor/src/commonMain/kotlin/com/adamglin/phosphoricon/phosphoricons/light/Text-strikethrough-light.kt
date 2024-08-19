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

public val LightGroup.`Text-strikethrough-light`: ImageVector
    get() {
        if (`_text-strikethrough-light` != null) {
            return `_text-strikethrough-light`!!
        }
        `_text-strikethrough-light` = Builder(name = "Text-strikethrough-light", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                horizontalLineTo(169.45f)
                curveToRelative(11.28f, 6.92f, 20.55f, 17.38f, 20.55f, 34.0f)
                curveToRelative(0.0f, 25.36f, -27.81f, 46.0f, -62.0f, 46.0f)
                reflectiveCurveToRelative(-62.0f, -20.64f, -62.0f, -46.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                curveToRelative(0.0f, 18.75f, 22.43f, 34.0f, 50.0f, 34.0f)
                reflectiveCurveToRelative(50.0f, -15.25f, 50.0f, -34.0f)
                curveToRelative(0.0f, -18.23f, -15.46f, -26.59f, -40.47f, -34.0f)
                horizontalLineTo(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineTo(216.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 222.0f, 128.0f)
                close()
                moveTo(76.33f, 102.0f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, 1.88f, -0.3f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 82.0f, 94.13f)
                arcTo(19.74f, 19.74f, 0.0f, false, true, 81.11f, 88.0f)
                curveToRelative(0.0f, -19.38f, 20.16f, -34.0f, 46.89f, -34.0f)
                curveToRelative(19.58f, 0.0f, 35.56f, 7.81f, 42.74f, 20.89f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 10.52f, -5.78f)
                curveTo(171.94f, 52.13f, 152.0f, 42.0f, 128.0f, 42.0f)
                curveTo(94.43f, 42.0f, 69.11f, 61.77f, 69.11f, 88.0f)
                arcToRelative(31.62f, 31.62f, 0.0f, false, false, 1.52f, 9.87f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 76.33f, 102.0f)
                close()
            }
        }
        .build()
        return `_text-strikethrough-light`!!
    }

private var `_text-strikethrough-light`: ImageVector? = null
