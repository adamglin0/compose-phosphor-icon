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

public val LightGroup.Folderlock: ImageVector
    get() {
        if (_folderlock != null) {
            return _folderlock!!
        }
        _folderlock = Builder(name = "Folderlock", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 162.0f)
                lineTo(214.0f, 162.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -52.0f, 0.0f)
                verticalLineToRelative(6.0f)
                lineTo(152.0f, 162.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(230.0f, 168.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 224.0f, 162.0f)
                close()
                moveTo(174.0f, 156.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 28.0f, 0.0f)
                verticalLineToRelative(6.0f)
                lineTo(174.0f, 162.0f)
                close()
                moveTo(218.0f, 202.0f)
                lineTo(158.0f, 202.0f)
                lineTo(158.0f, 174.0f)
                horizontalLineToRelative(60.0f)
                close()
                moveTo(216.0f, 74.0f)
                lineTo(130.49f, 74.0f)
                lineToRelative(-27.9f, -27.9f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, false, -9.9f, -4.1f)
                lineTo(40.0f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 56.0f)
                lineTo(26.0f, 200.62f)
                arcTo(13.39f, 13.39f, 0.0f, false, false, 39.38f, 214.0f)
                horizontalLineToRelative(73.18f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(39.38f, 202.0f)
                arcTo(1.4f, 1.4f, 0.0f, false, true, 38.0f, 200.62f)
                lineTo(38.0f, 86.0f)
                lineTo(216.0f, 86.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(230.0f, 88.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 216.0f, 74.0f)
                close()
                moveTo(40.0f, 54.0f)
                lineTo(92.69f, 54.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.41f, 0.59f)
                lineTo(113.51f, 74.0f)
                lineTo(38.0f, 74.0f)
                lineTo(38.0f, 56.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 40.0f, 54.0f)
                close()
            }
        }
        .build()
        return _folderlock!!
    }

private var _folderlock: ImageVector? = null
