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

public val BoldGroup.SpeakerSlash: ImageVector
    get() {
        if (_speakerSlash != null) {
            return _speakerSlash!!
        }
        _speakerSlash = Builder(name = "SpeakerSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.88f, 31.93f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 39.12f, 48.07f)
                lineTo(64.51f, 76.0f)
                lineTo(32.0f, 76.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 12.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(75.88f, 180.0f)
                lineToRelative(68.75f, 53.47f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 164.0f, 224.0f)
                lineTo(164.0f, 185.44f)
                lineToRelative(35.12f, 38.63f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.76f, -16.14f)
                close()
                moveTo(36.0f, 100.0f)
                lineTo(68.0f, 100.0f)
                verticalLineToRelative(56.0f)
                lineTo(36.0f, 156.0f)
                close()
                moveTo(140.0f, 199.46f)
                lineTo(92.0f, 162.13f)
                lineTo(92.0f, 106.24f)
                lineTo(140.0f, 159.0f)
                close()
                moveTo(109.0f, 65.46f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 2.11f, -16.84f)
                lineToRelative(33.51f, -26.07f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 164.0f, 32.0f)
                lineTo(164.0f, 94.94f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(140.0f, 56.54f)
                lineToRelative(-14.15f, 11.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 109.0f, 65.44f)
                close()
                moveTo(183.0f, 114.81f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 18.0f, -15.85f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 5.55f, 50.21f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -21.0f, -11.55f)
                arcTo(19.67f, 19.67f, 0.0f, false, false, 188.0f, 128.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 183.0f, 114.79f)
                close()
                moveTo(252.0f, 128.0f)
                arcToRelative(84.18f, 84.18f, 0.0f, false, true, -19.11f, 53.35f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -18.53f, -15.25f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 212.73f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 17.88f, -16.0f)
                arcTo(83.87f, 83.87f, 0.0f, false, true, 252.0f, 128.0f)
                close()
            }
        }
        .build()
        return _speakerSlash!!
    }

private var _speakerSlash: ImageVector? = null
