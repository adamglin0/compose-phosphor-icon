package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Fileaudio: ImageVector
    get() {
        if (_fileaudio != null) {
            return _fileaudio!!
        }
        _fileaudio = Builder(name = "Fileaudio", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 180.0f)
                arcToRelative(40.55f, 40.55f, 0.0f, false, true, -20.0f, 34.91f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 124.0f, 201.09f)
                arcToRelative(24.49f, 24.49f, 0.0f, false, false, 0.0f, -42.18f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 132.0f, 145.09f)
                arcTo(40.55f, 40.55f, 0.0f, false, true, 152.0f, 180.0f)
                close()
                moveTo(99.06f, 128.61f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.72f, 1.73f)
                lineTo(68.69f, 152.0f)
                lineTo(48.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(68.69f, 208.0f)
                lineToRelative(21.65f, 21.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 224.0f)
                lineTo(104.0f, 136.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 99.06f, 128.61f)
                close()
                moveTo(216.0f, 88.0f)
                lineTo(216.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(168.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(32.0f)
                lineTo(200.0f, 96.0f)
                lineTo(152.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(144.0f, 40.0f)
                lineTo(56.0f, 40.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(40.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 24.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.66f, 2.34f)
                lineToRelative(56.0f, 56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 88.0f)
                close()
                moveTo(160.0f, 80.0f)
                horizontalLineToRelative(28.69f)
                lineTo(160.0f, 51.31f)
                close()
            }
        }
        .build()
        return _fileaudio!!
    }

private var _fileaudio: ImageVector? = null
