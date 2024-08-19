package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Wifi-slash-bold`: ImageVector
    get() {
        if (`_wifi-slash-bold` != null) {
            return `_wifi-slash-bold`!!
        }
        `_wifi-slash-bold` = Builder(name = "Wifi-slash-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.88f, 207.93f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -17.76f, 16.14f)
                lineTo(147.78f, 167.6f)
                arcToRelative(56.06f, 56.06f, 0.0f, false, false, -52.71f, 7.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -14.14f, -19.4f)
                arcToRelative(79.35f, 79.35f, 0.0f, false, true, 41.92f, -15.12f)
                lineTo(103.51f, 118.9f)
                arcToRelative(104.18f, 104.18f, 0.0f, false, false, -40.06f, 19.55f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -14.9f, -18.81f)
                arcTo(128.46f, 128.46f, 0.0f, false, true, 85.61f, 99.21f)
                lineToRelative(-17.31f, -19.0f)
                arcToRelative(151.14f, 151.14f, 0.0f, false, false, -36.68f, 22.28f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 16.39f, 83.91f)
                arcToRelative(175.52f, 175.52f, 0.0f, false, true, 35.0f, -22.38f)
                lineTo(39.12f, 48.07f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 56.88f, 31.93f)
                close()
                moveTo(128.0f, 188.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 128.0f, 188.0f)
                close()
                moveTo(192.55f, 138.45f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 14.9f, -18.81f)
                arcTo(127.27f, 127.27f, 0.0f, false, false, 170.0f, 99.05f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.87f, 22.67f)
                arcTo(103.62f, 103.62f, 0.0f, false, true, 192.55f, 138.45f)
                close()
                moveTo(239.61f, 83.91f)
                arcTo(176.33f, 176.33f, 0.0f, false, false, 128.0f, 44.0f)
                curveToRelative(-3.94f, 0.0f, -7.93f, 0.13f, -11.86f, 0.39f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 1.59f, 24.0f)
                curveToRelative(3.4f, -0.23f, 6.86f, -0.34f, 10.27f, -0.34f)
                arcToRelative(152.24f, 152.24f, 0.0f, false, true, 96.38f, 34.46f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 15.23f, -18.55f)
                close()
            }
        }
        .build()
        return `_wifi-slash-bold`!!
    }

private var `_wifi-slash-bold`: ImageVector? = null
