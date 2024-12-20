package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.CirclesFour: ImageVector
    get() {
        if (_circlesFour != null) {
            return _circlesFour!!
        }
        _circlesFour = Builder(name = "CirclesFour", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(78.0f, 36.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, true, false, 42.0f, 42.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, false, 78.0f, 36.0f)
                close()
                moveTo(78.0f, 96.0f)
                arcTo(18.0f, 18.0f, 0.0f, true, true, 96.0f, 78.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 78.0f, 96.0f)
                close()
                moveTo(178.0f, 120.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, true, false, -42.0f, -42.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, false, 178.0f, 120.0f)
                close()
                moveTo(178.0f, 60.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, -18.0f, 18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 178.0f, 60.0f)
                close()
                moveTo(78.0f, 136.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, true, false, 42.0f, 42.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, false, 78.0f, 136.0f)
                close()
                moveTo(78.0f, 196.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 78.0f, 196.0f)
                close()
                moveTo(178.0f, 136.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, true, false, 42.0f, 42.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, false, 178.0f, 136.0f)
                close()
                moveTo(178.0f, 196.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 178.0f, 196.0f)
                close()
            }
        }
        .build()
        return _circlesFour!!
    }

private var _circlesFour: ImageVector? = null
