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

public val BoldGroup.FileAudio: ImageVector
    get() {
        if (_fileAudio != null) {
            return _fileAudio!!
        }
        _fileAudio = Builder(name = "FileAudio", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.59f, 124.91f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -13.08f, 2.6f)
                lineTo(63.0f, 148.0f)
                lineTo(44.0f, 148.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(63.0f, 212.0f)
                lineToRelative(20.48f, 20.48f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 104.0f, 224.0f)
                lineTo(104.0f, 136.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 96.59f, 124.91f)
                close()
                moveTo(80.0f, 195.0f)
                lineToRelative(-3.51f, -3.52f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 68.0f, 188.0f)
                lineTo(56.0f, 188.0f)
                lineTo(56.0f, 172.0f)
                lineTo(68.0f, 172.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.49f, -3.51f)
                lineTo(80.0f, 165.0f)
                close()
                moveTo(160.0f, 180.0f)
                arcToRelative(44.55f, 44.55f, 0.0f, false, true, -21.95f, 38.36f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 126.0f, 197.64f)
                arcToRelative(20.51f, 20.51f, 0.0f, false, false, 0.0f, -35.28f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.1f, -20.72f)
                arcTo(44.55f, 44.55f, 0.0f, false, true, 160.0f, 180.0f)
                close()
                moveTo(216.49f, 79.51f)
                lineToRelative(-56.0f, -56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 152.0f, 20.0f)
                lineTo(56.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 36.0f, 40.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(60.0f, 44.0f)
                horizontalLineToRelative(76.0f)
                lineTo(136.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(48.0f)
                lineTo(196.0f, 212.0f)
                lineTo(180.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(220.0f, 88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.49f, 79.51f)
                close()
                moveTo(160.0f, 57.0f)
                lineToRelative(23.0f, 23.0f)
                lineTo(160.0f, 80.0f)
                close()
            }
        }
        .build()
        return _fileAudio!!
    }

private var _fileAudio: ImageVector? = null
