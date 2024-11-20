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

public val LightGroup.FolderDashed: ImageVector
    get() {
        if (_folderDashed != null) {
            return _folderDashed!!
        }
        _folderDashed = Builder(name = "FolderDashed", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(94.0f, 208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(39.38f, 214.0f)
                arcTo(13.39f, 13.39f, 0.0f, false, true, 26.0f, 200.62f)
                lineTo(26.0f, 192.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(8.62f)
                arcTo(1.4f, 1.4f, 0.0f, false, false, 39.38f, 202.0f)
                lineTo(88.0f, 202.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 94.0f, 208.0f)
                close()
                moveTo(160.0f, 202.0f)
                lineTo(128.0f, 202.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(224.0f, 146.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(48.89f)
                arcToRelative(1.11f, 1.11f, 0.0f, false, true, -1.11f, 1.11f)
                lineTo(200.0f, 202.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(16.89f)
                arcTo(13.12f, 13.12f, 0.0f, false, false, 230.0f, 200.89f)
                lineTo(230.0f, 152.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 224.0f, 146.0f)
                close()
                moveTo(216.0f, 74.0f)
                lineTo(168.0f, 74.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(230.0f, 88.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 216.0f, 74.0f)
                close()
                moveTo(26.0f, 80.0f)
                lineTo(26.0f, 56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 40.0f, 42.0f)
                lineTo(92.69f, 42.0f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, true, 9.9f, 4.1f)
                lineToRelative(29.65f, 29.66f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 128.0f, 86.0f)
                lineTo(32.0f, 86.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 26.0f, 80.0f)
                close()
                moveTo(38.0f, 74.0f)
                horizontalLineToRelative(75.51f)
                lineTo(94.1f, 54.59f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 92.69f, 54.0f)
                lineTo(40.0f, 54.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                close()
                moveTo(32.0f, 158.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(38.0f, 120.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(32.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 32.0f, 158.0f)
                close()
            }
        }
        .build()
        return _folderDashed!!
    }

private var _folderDashed: ImageVector? = null
