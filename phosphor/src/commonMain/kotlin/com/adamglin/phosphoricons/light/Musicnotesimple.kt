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

public val LightGroup.Musicnotesimple: ImageVector
    get() {
        if (_musicnotesimple != null) {
            return _musicnotesimple!!
        }
        _musicnotesimple = Builder(name = "Musicnotesimple", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(209.72f, 58.25f)
                lineToRelative(-80.0f, -24.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 122.0f, 40.0f)
                verticalLineTo(153.05f)
                arcTo(46.0f, 46.0f, 0.0f, true, false, 134.0f, 184.0f)
                verticalLineTo(48.06f)
                lineToRelative(72.27f, 21.69f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 3.45f, -11.5f)
                close()
                moveTo(88.0f, 218.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, true, 34.0f, -34.0f)
                arcTo(34.0f, 34.0f, 0.0f, false, true, 88.0f, 218.0f)
                close()
            }
        }
        .build()
        return _musicnotesimple!!
    }

private var _musicnotesimple: ImageVector? = null
