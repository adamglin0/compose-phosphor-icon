package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.MicrophoneStage: ImageVector
    get() {
        if (_microphoneStage != null) {
            return _microphoneStage!!
        }
        _microphoneStage = Builder(name = "MicrophoneStage", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 12.0f)
                arcTo(75.9f, 75.9f, 0.0f, false, false, 92.49f, 96.33f)
                lineTo(23.91f, 189.85f)
                arcToRelative(19.89f, 19.89f, 0.0f, false, false, 2.0f, 26.0f)
                lineToRelative(14.29f, 14.29f)
                arcToRelative(19.89f, 19.89f, 0.0f, false, false, 26.0f, 2.0f)
                lineToRelative(93.52f, -68.58f)
                arcTo(76.0f, 76.0f, 0.0f, true, false, 168.0f, 12.0f)
                close()
                moveTo(220.0f, 88.0f)
                arcToRelative(51.66f, 51.66f, 0.0f, false, true, -7.75f, 27.27f)
                lineTo(140.74f, 43.75f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 220.0f, 88.0f)
                close()
                moveTo(54.72f, 210.71f)
                lineToRelative(-9.43f, -9.43f)
                lineToRelative(56.19f, -76.63f)
                arcToRelative(76.46f, 76.46f, 0.0f, false, false, 29.87f, 29.87f)
                close()
                moveTo(116.0f, 88.0f)
                arcToRelative(51.63f, 51.63f, 0.0f, false, true, 7.75f, -27.27f)
                lineToRelative(71.51f, 71.51f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 116.0f, 88.0f)
                close()
            }
        }
        .build()
        return _microphoneStage!!
    }

private var _microphoneStage: ImageVector? = null
