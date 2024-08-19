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

public val LightGroup.Gitfork: ImageVector
    get() {
        if (_gitfork != null) {
            return _gitfork!!
        }
        _gitfork = Builder(name = "Gitfork", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.0f, 64.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, -36.0f, 29.4f)
                verticalLineTo(112.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, 10.0f)
                horizontalLineTo(80.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, -10.0f)
                verticalLineTo(93.4f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, -12.0f, 0.0f)
                verticalLineTo(112.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, 22.0f)
                horizontalLineToRelative(42.0f)
                verticalLineToRelative(28.6f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, 12.0f, 0.0f)
                verticalLineTo(134.0f)
                horizontalLineToRelative(42.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, -22.0f)
                verticalLineTo(93.4f)
                arcTo(30.05f, 30.05f, 0.0f, false, false, 222.0f, 64.0f)
                close()
                moveTo(46.0f, 64.0f)
                arcTo(18.0f, 18.0f, 0.0f, true, true, 64.0f, 82.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 46.0f, 64.0f)
                close()
                moveTo(146.0f, 192.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, -18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 146.0f, 192.0f)
                close()
                moveTo(192.0f, 82.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 192.0f, 82.0f)
                close()
            }
        }
        .build()
        return _gitfork!!
    }

private var _gitfork: ImageVector? = null
