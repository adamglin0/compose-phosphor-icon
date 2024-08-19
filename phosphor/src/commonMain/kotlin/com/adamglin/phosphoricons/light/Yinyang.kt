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

public val LightGroup.Yinyang: ImageVector
    get() {
        if (_yinyang != null) {
            return _yinyang!!
        }
        _yinyang = Builder(name = "Yinyang", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(38.0f, 128.0f)
                arcToRelative(90.1f, 90.1f, 0.0f, false, true, 90.0f, -90.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, 0.0f, 84.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, false, -44.88f, 84.0f)
                arcTo(90.06f, 90.06f, 0.0f, false, true, 38.0f, 128.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, 0.0f, -84.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, false, 44.88f, -84.0f)
                arcTo(90.0f, 90.0f, 0.0f, false, true, 128.0f, 218.0f)
                close()
                moveTo(138.0f, 176.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 138.0f, 176.0f)
                close()
                moveTo(118.0f, 80.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 118.0f, 80.0f)
                close()
            }
        }
        .build()
        return _yinyang!!
    }

private var _yinyang: ImageVector? = null
