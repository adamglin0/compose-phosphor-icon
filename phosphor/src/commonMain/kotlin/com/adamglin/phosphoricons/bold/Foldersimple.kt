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

public val BoldGroup.FolderSimple: ImageVector
    get() {
        if (_folderSimple != null) {
            return _folderSimple!!
        }
        _folderSimple = Builder(name = "FolderSimple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 68.0f)
                lineTo(132.0f, 68.0f)
                lineTo(105.33f, 48.0f)
                arcToRelative(20.12f, 20.12f, 0.0f, false, false, -12.0f, -4.0f)
                lineTo(40.0f, 44.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 64.0f)
                lineTo(20.0f, 200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(216.89f, 220.0f)
                arcTo(19.13f, 19.13f, 0.0f, false, false, 236.0f, 200.89f)
                lineTo(236.0f, 88.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 216.0f, 68.0f)
                close()
                moveTo(212.0f, 196.0f)
                lineTo(44.0f, 196.0f)
                lineTo(44.0f, 68.0f)
                lineTo(92.0f, 68.0f)
                lineToRelative(28.8f, 21.6f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 128.0f, 92.0f)
                horizontalLineToRelative(84.0f)
                close()
            }
        }
        .build()
        return _folderSimple!!
    }

private var _folderSimple: ImageVector? = null
