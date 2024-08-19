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

public val LightGroup.Cube: ImageVector
    get() {
        if (_cube != null) {
            return _cube!!
        }
        _cube = Builder(name = "Cube", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.72f, 67.9f)
                lineToRelative(-88.0f, -48.17f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, -13.44f, 0.0f)
                lineToRelative(-88.0f, 48.18f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 80.18f)
                verticalLineToRelative(95.64f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 7.28f, 12.27f)
                lineToRelative(88.0f, 48.18f)
                arcToRelative(13.92f, 13.92f, 0.0f, false, false, 13.44f, 0.0f)
                lineToRelative(88.0f, -48.18f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 230.0f, 175.82f)
                lineTo(230.0f, 80.18f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 222.72f, 67.9f)
                close()
                moveTo(127.0f, 30.25f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.92f, 0.0f)
                lineTo(212.51f, 76.0f)
                lineTo(128.0f, 122.24f)
                lineTo(43.49f, 76.0f)
                close()
                moveTo(39.0f, 177.57f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.0f, -1.75f)
                lineTo(38.0f, 86.66f)
                lineToRelative(84.0f, 46.0f)
                lineTo(122.0f, 223.0f)
                close()
                moveTo(216.92f, 177.57f)
                lineTo(134.0f, 223.0f)
                lineTo(134.0f, 132.64f)
                lineToRelative(84.0f, -46.0f)
                verticalLineToRelative(89.16f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 217.0f, 177.57f)
                close()
            }
        }
        .build()
        return _cube!!
    }

private var _cube: ImageVector? = null
