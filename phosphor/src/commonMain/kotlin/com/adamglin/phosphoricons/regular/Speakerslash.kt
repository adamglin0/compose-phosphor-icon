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

public val RegularGroup.SpeakerSlash: ImageVector
    get() {
        if (_speakerSlash != null) {
            return _speakerSlash!!
        }
        _speakerSlash = Builder(name = "SpeakerSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(53.92f, 34.62f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 42.08f, 45.38f)
                lineTo(73.55f, 80.0f)
                lineTo(32.0f, 80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 16.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(77.25f, 176.0f)
                lineToRelative(69.84f, 54.31f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 160.0f, 224.0f)
                lineTo(160.0f, 175.09f)
                lineToRelative(42.08f, 46.29f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f)
                close()
                moveTo(32.0f, 96.0f)
                lineTo(72.0f, 96.0f)
                verticalLineToRelative(64.0f)
                lineTo(32.0f, 160.0f)
                close()
                moveTo(144.0f, 207.64f)
                lineTo(88.0f, 164.09f)
                lineTo(88.0f, 95.89f)
                lineToRelative(56.0f, 61.6f)
                close()
                moveTo(186.0f, 143.87f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 0.0f, -31.72f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 12.0f, -10.57f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 0.0f, 52.88f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.0f, -10.59f)
                close()
                moveTo(105.84f, 67.87f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 1.4f, -11.23f)
                lineToRelative(39.85f, -31.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 160.0f, 32.0f)
                verticalLineToRelative(74.83f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(144.0f, 48.36f)
                lineToRelative(-26.94f, 21.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 105.84f, 67.91f)
                close()
                moveTo(248.0f, 128.0f)
                arcToRelative(79.9f, 79.9f, 0.0f, false, true, -20.37f, 53.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.92f, -10.67f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 0.0f, -85.33f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.92f, -10.67f)
                arcTo(79.83f, 79.83f, 0.0f, false, true, 248.0f, 128.0f)
                close()
            }
        }
        .build()
        return _speakerSlash!!
    }

private var _speakerSlash: ImageVector? = null
