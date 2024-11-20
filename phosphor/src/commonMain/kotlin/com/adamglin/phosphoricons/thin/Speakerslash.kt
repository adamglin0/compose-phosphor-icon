package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.SpeakerSlash: ImageVector
    get() {
        if (_speakerSlash != null) {
            return _speakerSlash!!
        }
        _speakerSlash = Builder(name = "SpeakerSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(51.0f, 37.31f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 45.0f, 42.69f)
                lineTo(81.0f, 82.19f)
                lineTo(78.63f, 84.0f)
                lineTo(32.0f, 84.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(78.63f, 172.0f)
                lineToRelative(70.91f, 55.16f)
                arcTo(4.07f, 4.07f, 0.0f, false, false, 152.0f, 228.0f)
                arcToRelative(3.92f, 3.92f, 0.0f, false, false, 1.76f, -0.41f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 156.0f, 224.0f)
                lineTo(156.0f, 164.75f)
                lineToRelative(49.0f, 53.94f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.92f, -5.38f)
                close()
                moveTo(28.0f, 160.0f)
                lineTo(28.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(76.0f, 92.0f)
                verticalLineToRelative(72.0f)
                lineTo(32.0f, 164.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 28.0f, 160.0f)
                close()
                moveTo(148.0f, 215.82f)
                lineTo(84.0f, 166.0f)
                lineTo(84.0f, 90.0f)
                lineToRelative(2.35f, -1.83f)
                lineTo(148.0f, 156.0f)
                close()
                moveTo(189.0f, 146.52f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.0f, -37.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 6.0f, -5.29f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 0.0f, 47.59f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -6.0f, -5.29f)
                close()
                moveTo(109.0f, 65.45f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.7f, -5.61f)
                lineToRelative(39.85f, -31.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 156.0f, 32.0f)
                verticalLineToRelative(74.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(148.0f, 40.18f)
                lineToRelative(-33.39f, 26.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 109.0f, 65.45f)
                close()
                moveTo(244.0f, 128.0f)
                arcToRelative(75.88f, 75.88f, 0.0f, false, true, -19.35f, 50.67f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.0f, -5.34f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, 0.0f, -90.66f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.0f, -5.34f)
                arcTo(75.88f, 75.88f, 0.0f, false, true, 244.0f, 128.0f)
                close()
            }
        }
        .build()
        return _speakerSlash!!
    }

private var _speakerSlash: ImageVector? = null
