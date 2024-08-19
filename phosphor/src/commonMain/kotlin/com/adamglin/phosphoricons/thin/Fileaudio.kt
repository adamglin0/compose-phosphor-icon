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

public val ThinGroup.Fileaudio: ImageVector
    get() {
        if (_fileaudio != null) {
            return _fileaudio!!
        }
        _fileaudio = Builder(name = "Fileaudio", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(97.53f, 132.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.36f, 0.87f)
                lineTo(70.34f, 156.0f)
                lineTo(48.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(70.34f, 204.0f)
                lineToRelative(22.83f, 22.83f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 100.0f, 224.0f)
                lineTo(100.0f, 136.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 97.53f, 132.3f)
                close()
                moveTo(92.0f, 214.3f)
                lineTo(74.83f, 197.17f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 72.0f, 196.0f)
                lineTo(52.0f, 196.0f)
                lineTo(52.0f, 164.0f)
                lineTo(72.0f, 164.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.83f, -1.17f)
                lineTo(92.0f, 145.66f)
                close()
                moveTo(148.0f, 180.0f)
                arcToRelative(36.52f, 36.52f, 0.0f, false, true, -18.0f, 31.45f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -6.9f)
                arcToRelative(28.5f, 28.5f, 0.0f, false, false, 0.0f, -49.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -6.9f)
                arcTo(36.52f, 36.52f, 0.0f, false, true, 148.0f, 180.0f)
                close()
                moveTo(210.83f, 85.17f)
                lineTo(154.83f, 29.17f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 152.0f, 28.0f)
                lineTo(56.0f, 28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 44.0f, 40.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(52.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(92.0f)
                lineTo(148.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(52.0f)
                lineTo(204.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(168.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(212.0f, 88.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 210.83f, 85.17f)
                close()
                moveTo(156.0f, 41.65f)
                lineTo(198.34f, 84.0f)
                lineTo(156.0f, 84.0f)
                close()
            }
        }
        .build()
        return _fileaudio!!
    }

private var _fileaudio: ImageVector? = null
