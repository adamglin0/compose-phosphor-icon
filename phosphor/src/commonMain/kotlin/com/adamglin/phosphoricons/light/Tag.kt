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

public val LightGroup.Tag: ImageVector
    get() {
        if (_tag != null) {
            return _tag!!
        }
        _tag = Builder(name = "Tag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(241.91f, 137.42f)
                lineTo(142.59f, 38.1f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, false, -9.9f, -4.1f)
                lineTo(40.0f, 34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(92.69f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, false, 4.1f, 9.9f)
                lineToRelative(99.32f, 99.32f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 19.8f, 0.0f)
                lineToRelative(84.69f, -84.69f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 241.91f, 137.42f)
                close()
                moveTo(233.42f, 148.73f)
                lineTo(148.73f, 233.42f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.83f, 0.0f)
                lineTo(46.59f, 134.1f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.59f, -1.41f)
                lineTo(46.0f, 46.0f)
                horizontalLineToRelative(86.69f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.41f, 0.59f)
                lineToRelative(99.32f, 99.31f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 233.42f, 148.73f)
                close()
                moveTo(94.0f, 84.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, true, 84.0f, 74.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 94.0f, 84.0f)
                close()
            }
        }
        .build()
        return _tag!!
    }

private var _tag: ImageVector? = null
