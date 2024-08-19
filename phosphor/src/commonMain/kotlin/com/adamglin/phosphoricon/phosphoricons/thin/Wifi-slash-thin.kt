package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Wifi-slash-thin`: ImageVector
    get() {
        if (`_wifi-slash-thin` != null) {
            return `_wifi-slash-thin`!!
        }
        `_wifi-slash-thin` = Builder(name = "Wifi-slash-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.0f, 204.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 136.0f, 204.0f)
                close()
                moveTo(51.0f, 37.31f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 45.0f, 42.69f)
                lineTo(64.72f, 64.34f)
                arcTo(167.64f, 167.64f, 0.0f, false, false, 21.46f, 90.09f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.08f, 6.19f)
                arcTo(159.4f, 159.4f, 0.0f, false, true, 70.47f, 70.66f)
                lineToRelative(29.64f, 32.61f)
                arcToRelative(120.12f, 120.12f, 0.0f, false, false, -46.6f, 22.64f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.0f, 6.27f)
                arcToRelative(112.0f, 112.0f, 0.0f, false, true, 47.85f, -22.07f)
                lineTo(142.0f, 149.37f)
                arcTo(72.6f, 72.6f, 0.0f, false, false, 128.0f, 148.0f)
                arcToRelative(71.49f, 71.49f, 0.0f, false, false, -42.36f, 13.77f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 88.0f, 169.0f)
                arcToRelative(4.07f, 4.07f, 0.0f, false, false, 2.36f, -0.76f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, 62.11f, -7.38f)
                lineTo(205.0f, 218.69f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.92f, -5.38f)
                close()
                moveTo(234.54f, 90.09f)
                arcTo(168.33f, 168.33f, 0.0f, false, false, 128.0f, 52.0f)
                arcToRelative(171.08f, 171.08f, 0.0f, false, false, -21.5f, 1.36f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.0f, 7.94f)
                arcTo(162.68f, 162.68f, 0.0f, false, true, 128.0f, 60.0f)
                arcTo(160.22f, 160.22f, 0.0f, false, true, 229.46f, 96.28f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.08f, -6.19f)
                close()
                moveTo(197.54f, 132.18f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.0f, -6.27f)
                arcToRelative(120.17f, 120.17f, 0.0f, false, false, -50.06f, -23.42f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -1.62f, 7.83f)
                arcTo(112.18f, 112.18f, 0.0f, false, true, 197.52f, 132.18f)
                close()
            }
        }
        .build()
        return `_wifi-slash-thin`!!
    }

private var `_wifi-slash-thin`: ImageVector? = null
