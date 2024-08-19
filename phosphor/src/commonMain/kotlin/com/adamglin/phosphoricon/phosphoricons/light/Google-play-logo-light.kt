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

public val LightGroup.`Google-play-logo-light`: ImageVector
    get() {
        if (`_google-play-logo-light` != null) {
            return `_google-play-logo-light`!!
        }
        `_google-play-logo-light` = Builder(name = "Google-play-logo-light", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.84f, 115.93f)
                lineTo(71.0f, 19.89f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.12f, 0.0f)
                arcTo(13.68f, 13.68f, 0.0f, false, false, 50.0f, 31.87f)
                lineTo(50.0f, 224.13f)
                arcToRelative(13.68f, 13.68f, 0.0f, false, false, 6.92f, 11.94f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.12f, 0.0f)
                lineToRelative(167.8f, -96.0f)
                arcToRelative(13.75f, 13.75f, 0.0f, false, false, 0.0f, -24.14f)
                close()
                moveTo(62.0f, 217.5f)
                lineTo(62.0f, 38.5f)
                lineTo(151.51f, 128.0f)
                close()
                moveTo(160.0f, 136.5f)
                lineTo(182.19f, 158.69f)
                lineTo(78.4f, 218.07f)
                close()
                moveTo(78.4f, 37.93f)
                lineToRelative(103.79f, 59.4f)
                lineTo(160.0f, 119.52f)
                close()
                moveTo(233.0f, 129.58f)
                lineToRelative(-0.1f, 0.06f)
                lineTo(193.0f, 152.49f)
                lineTo(168.49f, 128.0f)
                lineTo(193.0f, 103.51f)
                lineToRelative(39.94f, 22.85f)
                lineToRelative(0.1f, 0.06f)
                arcToRelative(1.76f, 1.76f, 0.0f, false, true, 0.0f, 3.16f)
                close()
            }
        }
        .build()
        return `_google-play-logo-light`!!
    }

private var `_google-play-logo-light`: ImageVector? = null
