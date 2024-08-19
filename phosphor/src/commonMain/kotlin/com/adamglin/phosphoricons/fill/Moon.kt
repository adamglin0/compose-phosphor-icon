package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.54f, 150.21f)
                arcToRelative(104.84f, 104.84f, 0.0f, false, true, -37.0f, 52.91f)
                arcTo(104.0f, 104.0f, 0.0f, false, true, 32.0f, 120.0f)
                arcTo(103.09f, 103.09f, 0.0f, false, true, 52.88f, 57.48f)
                arcToRelative(104.84f, 104.84f, 0.0f, false, true, 52.91f, -37.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.0f, 10.0f)
                arcToRelative(88.08f, 88.08f, 0.0f, false, false, 109.8f, 109.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.0f, 10.0f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null
