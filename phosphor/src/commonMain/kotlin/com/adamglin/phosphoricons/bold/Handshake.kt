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

public val BoldGroup.Handshake: ImageVector
    get() {
        if (_handshake != null) {
            return _handshake!!
        }
        _handshake = Builder(name = "Handshake", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(253.88f, 108.11f)
                lineToRelative(-25.53f, -51.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -26.83f, -9.0f)
                lineTo(178.34f, 59.7f)
                lineTo(131.7f, 44.58f)
                arcToRelative(12.14f, 12.14f, 0.0f, false, false, -7.4f, 0.0f)
                lineTo(77.66f, 59.7f)
                lineTo(54.48f, 48.11f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -26.83f, 9.0f)
                lineTo(2.12f, 108.11f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 9.0f, 26.83f)
                lineToRelative(26.67f, 13.34f)
                lineToRelative(51.18f, 37.41f)
                arcTo(12.15f, 12.15f, 0.0f, false, false, 93.0f, 187.62f)
                lineToRelative(62.0f, 16.0f)
                arcToRelative(12.27f, 12.27f, 0.0f, false, false, 3.0f, 0.38f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.48f, -3.52f)
                lineToRelative(52.62f, -52.62f)
                lineToRelative(25.83f, -12.92f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 8.95f, -26.83f)
                close()
                moveTo(195.76f, 137.26f)
                lineTo(168.24f, 111.26f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.76f, 0.26f)
                curveToRelative(-9.66f, 9.74f, -25.06f, 16.81f, -40.81f, 9.55f)
                lineToRelative(38.19f, -37.0f)
                horizontalLineToRelative(22.72f)
                lineToRelative(25.81f, 51.63f)
                close()
                moveTo(47.32f, 71.37f)
                lineTo(60.59f, 78.0f)
                lineToRelative(-22.0f, 43.9f)
                lineToRelative(-13.27f, -6.63f)
                close()
                moveTo(154.32f, 178.67f)
                lineTo(101.23f, 165.0f)
                lineToRelative(-42.0f, -30.66f)
                lineTo(85.17f, 82.5f)
                lineTo(128.0f, 68.61f)
                lineToRelative(1.69f, 0.55f)
                lineTo(90.0f, 107.68f)
                lineToRelative(-0.13f, 0.12f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 3.4f, 31.0f)
                curveToRelative(20.95f, 13.39f, 46.0f, 12.07f, 66.33f, -2.73f)
                lineToRelative(19.2f, 18.15f)
                close()
                moveTo(217.32f, 121.9f)
                lineTo(195.32f, 78.0f)
                lineTo(208.59f, 71.37f)
                lineTo(230.54f, 115.27f)
                close()
                moveTo(118.55f, 219.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -14.62f, 8.62f)
                lineToRelative(-26.6f, -6.87f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -4.08f, -1.93f)
                lineTo(48.92f, 201.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 14.16f, -19.37f)
                lineToRelative(22.47f, 16.42f)
                lineToRelative(24.38f, 6.29f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 118.55f, 219.0f)
                close()
            }
        }
        .build()
        return _handshake!!
    }

private var _handshake: ImageVector? = null
