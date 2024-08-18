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

public val FillGroup.`Webcam-slash-fill`: ImageVector
    get() {
        if (`_webcam-slash-fill` != null) {
            return `_webcam-slash-fill`!!
        }
        `_webcam-slash-fill` = Builder(name = "Webcam-slash-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(83.34f, 43.19f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.78f, -6.0f)
                arcTo(80.0f, 80.0f, 0.0f, false, true, 190.39f, 154.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.11f, 0.22f)
                lineToRelative(-16.43f, -18.08f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.3f, -5.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -62.84f, -69.11f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.94f, -0.78f)
                close()
                moveTo(126.93f, 72.0f)
                arcToRelative(31.8f, 31.8f, 0.0f, false, false, -8.43f, 1.42f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 116.75f, 80.0f)
                lineToRelative(34.12f, 37.53f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.67f, -1.18f)
                arcTo(31.84f, 31.84f, 0.0f, false, false, 160.0f, 104.0f)
                arcTo(32.36f, 32.36f, 0.0f, false, false, 126.93f, 72.0f)
                close()
                moveTo(213.38f, 221.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.3f, -0.54f)
                lineTo(197.19f, 216.0f)
                lineTo(32.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.53f)
                arcTo(8.17f, 8.17f, 0.0f, false, true, 32.27f, 200.0f)
                lineTo(120.0f, 200.0f)
                lineTo(120.0f, 183.6f)
                arcTo(79.93f, 79.93f, 0.0f, false, true, 58.86f, 63.84f)
                lineTo(42.08f, 45.38f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 53.92f, 34.62f)
                lineToRelative(160.0f, 176.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 213.38f, 221.92f)
                close()
                moveTo(128.0f, 152.0f)
                arcToRelative(48.17f, 48.17f, 0.0f, false, false, 10.0f, -1.06f)
                lineToRelative(-13.79f, -15.17f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 96.0f, 104.71f)
                lineTo(82.23f, 89.55f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 128.0f, 152.0f)
                close()
                moveTo(182.64f, 200.0f)
                lineTo(161.42f, 176.66f)
                arcTo(79.24f, 79.24f, 0.0f, false, true, 136.0f, 183.6f)
                lineTo(136.0f, 200.0f)
                close()
            }
        }
        .build()
        return `_webcam-slash-fill`!!
    }

private var `_webcam-slash-fill`: ImageVector? = null
