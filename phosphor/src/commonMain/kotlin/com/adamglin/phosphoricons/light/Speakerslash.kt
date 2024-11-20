package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.SpeakerSlash: ImageVector
    get() {
        if (_speakerSlash != null) {
            return _speakerSlash!!
        }
        _speakerSlash = Builder(name = "SpeakerSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(52.44f, 36.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 43.56f, 44.0f)
                lineTo(78.0f, 81.94f)
                lineToRelative(-0.08f, 0.06f)
                lineTo(32.0f, 82.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 18.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(77.94f, 174.0f)
                lineToRelative(70.38f, 54.74f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 158.0f, 224.0f)
                lineTo(158.0f, 169.92f)
                lineTo(203.56f, 220.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.88f, -8.08f)
                close()
                moveTo(30.0f, 160.0f)
                lineTo(30.0f, 96.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(74.0f, 94.0f)
                verticalLineToRelative(68.0f)
                lineTo(32.0f, 162.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 30.0f, 160.0f)
                close()
                moveTo(146.0f, 211.73f)
                lineTo(86.0f, 165.07f)
                lineTo(86.0f, 90.93f)
                lineToRelative(0.11f, -0.08f)
                lineTo(146.0f, 156.72f)
                close()
                moveTo(187.5f, 145.2f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, 0.0f, -34.37f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 9.0f, -7.93f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, true, 0.0f, 50.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -9.0f, -7.94f)
                close()
                moveTo(107.41f, 66.68f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 1.06f, -8.42f)
                lineToRelative(39.85f, -31.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 158.0f, 32.0f)
                verticalLineToRelative(74.83f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(146.0f, 44.27f)
                lineTo(115.83f, 67.73f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 107.41f, 66.68f)
                close()
                moveTo(246.0f, 128.0f)
                arcToRelative(77.86f, 77.86f, 0.0f, false, true, -19.86f, 52.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.94f, -8.0f)
                arcToRelative(66.0f, 66.0f, 0.0f, false, false, 0.0f, -88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 8.94f, -8.0f)
                arcTo(77.86f, 77.86f, 0.0f, false, true, 246.0f, 128.0f)
                close()
            }
        }
        .build()
        return _speakerSlash!!
    }

private var _speakerSlash: ImageVector? = null
