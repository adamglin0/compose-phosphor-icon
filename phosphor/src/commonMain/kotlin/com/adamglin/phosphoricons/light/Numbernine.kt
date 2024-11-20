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

public val LightGroup.NumberNine: ImageVector
    get() {
        if (_numberNine != null) {
            return _numberNine!!
        }
        _numberNine = Builder(name = "NumberNine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 42.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, true, false, 19.94f, 104.17f)
                lineToRelative(-33.17f, 58.88f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 10.46f, 5.89f)
                lineToRelative(49.54f, -88.0f)
                arcTo(54.0f, 54.0f, 0.0f, false, false, 128.0f, 42.0f)
                close()
                moveTo(128.0f, 138.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, true, true, 42.0f, -42.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, true, 128.0f, 138.0f)
                close()
            }
        }
        .build()
        return _numberNine!!
    }

private var _numberNine: ImageVector? = null
