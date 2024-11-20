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

public val LightGroup.Brandy: ImageVector
    get() {
        if (_brandy != null) {
            return _brandy!!
        }
        _brandy = Builder(name = "Brandy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.0f, 88.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(93.64f, 93.64f, 0.0f, false, false, -15.21f, -51.28f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.0f, -2.72f)
                horizontalLineTo(54.23f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.0f, 2.72f)
                arcTo(93.64f, 93.64f, 0.0f, false, false, 34.0f, 88.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(94.1f, 94.1f, 0.0f, false, false, 88.0f, 93.8f)
                verticalLineTo(218.0f)
                horizontalLineTo(88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                horizontalLineTo(134.0f)
                verticalLineTo(181.8f)
                arcTo(94.1f, 94.1f, 0.0f, false, false, 222.0f, 88.0f)
                close()
                moveTo(57.56f, 46.0f)
                horizontalLineTo(198.44f)
                arcToRelative(81.62f, 81.62f, 0.0f, false, true, 11.34f, 36.0f)
                horizontalLineTo(46.22f)
                arcTo(81.62f, 81.62f, 0.0f, false, true, 57.56f, 46.0f)
                close()
                moveTo(128.0f, 170.0f)
                arcTo(82.09f, 82.09f, 0.0f, false, true, 46.24f, 94.0f)
                horizontalLineTo(209.76f)
                arcTo(82.09f, 82.09f, 0.0f, false, true, 128.0f, 170.0f)
                close()
            }
        }
        .build()
        return _brandy!!
    }

private var _brandy: ImageVector? = null
