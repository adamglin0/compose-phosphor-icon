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

public val ThinGroup.FolderSimpleDashed: ImageVector
    get() {
        if (_folderSimpleDashed != null) {
            return _folderSimpleDashed!!
        }
        _folderSimpleDashed = Builder(name = "FolderSimpleDashed", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(125.6f, 83.2f)
                lineTo(95.73f, 60.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.4f, -0.8f)
                lineTo(40.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(36.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(28.0f, 64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 40.0f, 52.0f)
                lineTo(93.33f, 52.0f)
                arcToRelative(12.05f, 12.05f, 0.0f, false, true, 7.2f, 2.4f)
                lineTo(130.4f, 76.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -4.8f, 6.4f)
                close()
                moveTo(88.0f, 204.0f)
                lineTo(39.38f, 204.0f)
                arcTo(3.39f, 3.39f, 0.0f, false, true, 36.0f, 200.62f)
                lineTo(36.0f, 192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(8.62f)
                arcTo(11.4f, 11.4f, 0.0f, false, false, 39.38f, 212.0f)
                lineTo(88.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(160.0f, 204.0f)
                lineTo(128.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(224.0f, 148.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(48.89f)
                arcToRelative(3.12f, 3.12f, 0.0f, false, true, -3.11f, 3.11f)
                lineTo(200.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(16.89f)
                arcTo(11.12f, 11.12f, 0.0f, false, false, 228.0f, 200.89f)
                lineTo(228.0f, 152.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 224.0f, 148.0f)
                close()
                moveTo(216.0f, 76.0f)
                lineTo(168.0f, 76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(228.0f, 88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 76.0f)
                close()
                moveTo(32.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(36.0f, 120.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 32.0f, 156.0f)
                close()
            }
        }
        .build()
        return _folderSimpleDashed!!
    }

private var _folderSimpleDashed: ImageVector? = null
