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

public val ThinGroup.FolderStar: ImageVector
    get() {
        if (_folderStar != null) {
            return _folderStar!!
        }
        _folderStar = Builder(name = "FolderStar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 84.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(228.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(129.66f, 76.0f)
                lineTo(101.17f, 47.51f)
                arcTo(11.93f, 11.93f, 0.0f, false, false, 92.69f, 44.0f)
                lineTo(40.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 56.0f)
                lineTo(28.0f, 200.61f)
                arcTo(11.4f, 11.4f, 0.0f, false, false, 39.38f, 212.0f)
                horizontalLineToRelative(81.18f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(39.38f, 204.0f)
                arcTo(3.39f, 3.39f, 0.0f, false, true, 36.0f, 200.61f)
                lineTo(36.0f, 84.0f)
                close()
                moveTo(40.0f, 52.0f)
                lineTo(92.69f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.82f, 1.17f)
                lineTo(118.34f, 76.0f)
                lineTo(36.0f, 76.0f)
                lineTo(36.0f, 56.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 40.0f, 52.0f)
                close()
                moveTo(235.81f, 160.41f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.5f, -2.79f)
                lineToRelative(-32.24f, -2.49f)
                lineToRelative(-12.4f, -28.72f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.34f, 0.0f)
                lineToRelative(-12.4f, 28.72f)
                lineToRelative(-32.24f, 2.49f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.24f, 7.08f)
                lineToRelative(24.46f, 20.19f)
                lineTo(150.45f, 215.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.91f, 4.41f)
                lineTo(184.0f, 203.18f)
                lineToRelative(27.64f, 16.27f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.0f, 0.55f)
                arcToRelative(4.05f, 4.05f, 0.0f, false, false, 2.39f, -0.79f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.49f, -4.17f)
                lineToRelative(-7.46f, -30.15f)
                lineToRelative(24.46f, -20.19f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 235.81f, 160.41f)
                close()
                moveTo(203.05f, 180.32f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.33f, 4.05f)
                lineToRelative(5.78f, 23.36f)
                lineTo(186.0f, 195.09f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.06f, 0.0f)
                lineTo(160.5f, 207.73f)
                lineToRelative(5.78f, -23.36f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.33f, -4.05f)
                lineToRelative(-18.76f, -15.48f)
                lineTo(171.0f, 162.92f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.36f, -2.4f)
                lineTo(184.0f, 138.1f)
                lineToRelative(9.68f, 22.42f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.36f, 2.4f)
                lineToRelative(24.77f, 1.92f)
                close()
            }
        }
        .build()
        return _folderStar!!
    }

private var _folderStar: ImageVector? = null
