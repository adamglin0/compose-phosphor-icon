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

public val LightGroup.Signin: ImageVector
    get() {
        if (_signin != null) {
            return _signin!!
        }
        _signin = Builder(name = "Signin", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(140.24f, 132.24f)
                lineToRelative(-40.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f)
                lineTo(121.51f, 134.0f)
                horizontalLineTo(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(97.51f)
                lineTo(91.76f, 92.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f)
                lineToRelative(40.0f, 40.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 140.24f, 132.24f)
                close()
                moveTo(200.0f, 34.0f)
                horizontalLineTo(136.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(58.0f)
                verticalLineTo(210.0f)
                horizontalLineTo(136.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                verticalLineTo(40.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 200.0f, 34.0f)
                close()
            }
        }
        .build()
        return _signin!!
    }

private var _signin: ImageVector? = null
