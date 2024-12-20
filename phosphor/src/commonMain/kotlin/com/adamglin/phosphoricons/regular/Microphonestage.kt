package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.MicrophoneStage: ImageVector
    get() {
        if (_microphoneStage != null) {
            return _microphoneStage!!
        }
        _microphoneStage = Builder(name = "MicrophoneStage", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 16.0f)
                arcTo(72.07f, 72.07f, 0.0f, false, false, 96.0f, 88.0f)
                arcToRelative(73.29f, 73.29f, 0.0f, false, false, 0.63f, 9.42f)
                lineTo(27.12f, 192.22f)
                arcTo(15.93f, 15.93f, 0.0f, false, false, 28.71f, 213.0f)
                lineTo(43.0f, 227.29f)
                arcToRelative(15.93f, 15.93f, 0.0f, false, false, 20.78f, 1.59f)
                lineToRelative(94.81f, -69.53f)
                arcTo(73.29f, 73.29f, 0.0f, false, false, 168.0f, 160.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, false, 0.0f, -144.0f)
                close()
                moveTo(224.0f, 88.0f)
                arcToRelative(55.72f, 55.72f, 0.0f, false, true, -11.16f, 33.52f)
                lineTo(134.49f, 43.16f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 224.0f, 88.0f)
                close()
                moveTo(54.32f, 216.0f)
                lineTo(40.0f, 201.68f)
                lineTo(102.14f, 117.0f)
                arcTo(72.37f, 72.37f, 0.0f, false, false, 139.0f, 153.86f)
                close()
                moveTo(112.0f, 88.0f)
                arcToRelative(55.67f, 55.67f, 0.0f, false, true, 11.16f, -33.51f)
                lineToRelative(78.34f, 78.34f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 112.0f, 88.0f)
                close()
                moveTo(109.65f, 146.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.31f)
                lineToRelative(-8.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.31f, -11.31f)
                lineToRelative(8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 109.67f, 146.33f)
                close()
            }
        }
        .build()
        return _microphoneStage!!
    }

private var _microphoneStage: ImageVector? = null
