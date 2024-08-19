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

public val LightGroup.`Swatches-light`: ImageVector
    get() {
        if (`_swatches-light` != null) {
            return `_swatches-light`!!
        }
        `_swatches-light` = Builder(name = "Swatches-light", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(86.0f, 180.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 86.0f, 180.0f)
                close()
                moveTo(238.0f, 156.19f)
                lineTo(238.0f, 208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f)
                lineTo(76.0f, 222.0f)
                arcToRelative(44.18f, 44.18f, 0.0f, false, true, -7.58f, -0.65f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, -33.81f, -48.64f)
                lineToRelative(25.0f, -143.13f)
                arcTo(13.94f, 13.94f, 0.0f, false, true, 75.82f, 18.22f)
                lineToRelative(54.67f, 9.72f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 11.3f, 16.21f)
                lineToRelative(-12.67f, 72.44f)
                lineToRelative(71.0f, -25.75f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 17.89f, 8.32f)
                lineToRelative(19.09f, 52.22f)
                arcTo(15.66f, 15.66f, 0.0f, false, true, 238.0f, 156.19f)
                close()
                moveTo(104.93f, 185.19f)
                lineTo(130.0f, 42.08f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.58f, -2.32f)
                lineTo(73.72f, 30.0f)
                lineToRelative(-0.34f, 0.0f)
                arcToRelative(1.84f, 1.84f, 0.0f, false, false, -1.07f, 0.35f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.82f, 1.3f)
                lineToRelative(-25.0f, 143.13f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 24.09f, 34.76f)
                arcToRelative(29.25f, 29.25f, 0.0f, false, false, 22.0f, -4.89f)
                arcToRelative(29.81f, 29.81f, 0.0f, false, false, 12.33f, -19.44f)
                close()
                moveTo(113.18f, 198.36f)
                lineTo(224.71f, 158.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.11f, -1.0f)
                arcToRelative(1.86f, 1.86f, 0.0f, false, false, 0.06f, -1.46f)
                lineToRelative(-19.09f, -52.21f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.53f, -1.17f)
                lineToRelative(-77.53f, 28.09f)
                lineToRelative(-10.0f, 57.07f)
                arcTo(41.9f, 41.9f, 0.0f, false, true, 113.18f, 198.38f)
                close()
                moveTo(226.0f, 170.27f)
                lineTo(116.35f, 210.0f)
                lineTo(224.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                close()
            }
        }
        .build()
        return `_swatches-light`!!
    }

private var `_swatches-light`: ImageVector? = null
