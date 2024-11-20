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

public val LightGroup.FolderStar: ImageVector
    get() {
        if (_folderStar != null) {
            return _folderStar!!
        }
        _folderStar = Builder(name = "FolderStar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 86.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(230.0f, 88.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                lineTo(130.48f, 74.0f)
                lineToRelative(-27.9f, -27.9f)
                arcTo(13.9f, 13.9f, 0.0f, false, false, 92.69f, 42.0f)
                lineTo(40.0f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 56.0f)
                lineTo(26.0f, 200.61f)
                arcTo(13.39f, 13.39f, 0.0f, false, false, 39.38f, 214.0f)
                horizontalLineToRelative(81.18f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(39.38f, 202.0f)
                arcTo(1.4f, 1.4f, 0.0f, false, true, 38.0f, 200.61f)
                lineTo(38.0f, 86.0f)
                close()
                moveTo(40.0f, 54.0f)
                lineTo(92.69f, 54.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.41f, 0.58f)
                lineTo(113.52f, 74.0f)
                lineTo(38.0f, 74.0f)
                lineTo(38.0f, 56.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 40.0f, 54.0f)
                close()
                moveTo(237.72f, 159.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.26f, -4.17f)
                lineToRelative(-31.0f, -2.4f)
                lineToRelative(-11.91f, -27.61f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -11.0f, 0.0f)
                lineToRelative(-11.91f, 27.61f)
                lineToRelative(-31.0f, 2.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.36f, 10.61f)
                lineToRelative(23.49f, 19.39f)
                lineToRelative(-7.16f, 28.93f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.87f, 6.61f)
                lineTo(184.0f, 205.5f)
                lineToRelative(26.62f, 15.67f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.87f, -6.61f)
                lineToRelative(-7.16f, -28.93f)
                lineToRelative(23.49f, -19.39f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 237.72f, 159.8f)
                close()
                moveTo(201.78f, 178.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.0f, 6.07f)
                lineToRelative(4.64f, 18.74f)
                lineTo(187.0f, 193.36f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.08f, 0.0f)
                lineToRelative(-17.37f, 10.23f)
                lineToRelative(4.63f, -18.74f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.0f, -6.07f)
                lineToRelative(-14.94f, -12.33f)
                lineToRelative(19.83f, -1.53f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.0f, -3.61f)
                lineTo(184.0f, 143.14f)
                lineToRelative(7.84f, 18.17f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.0f, 3.61f)
                lineToRelative(19.83f, 1.53f)
                close()
            }
        }
        .build()
        return _folderStar!!
    }

private var _folderStar: ImageVector? = null
