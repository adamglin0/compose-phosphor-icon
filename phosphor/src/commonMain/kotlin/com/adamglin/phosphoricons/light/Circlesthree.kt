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

public val LightGroup.CirclesThree: ImageVector
    get() {
        if (_circlesThree != null) {
            return _circlesThree!!
        }
        _circlesThree = Builder(name = "CirclesThree", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(170.0f, 76.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, true, false, -42.0f, 42.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, false, 170.0f, 76.0f)
                close()
                moveTo(128.0f, 106.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, true, 30.0f, -30.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, true, 128.0f, 106.0f)
                close()
                moveTo(188.0f, 130.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, true, false, 42.0f, 42.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, false, 188.0f, 130.0f)
                close()
                moveTo(188.0f, 202.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, true, 30.0f, -30.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, true, 188.0f, 202.0f)
                close()
                moveTo(68.0f, 130.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, true, false, 42.0f, 42.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, false, 68.0f, 130.0f)
                close()
                moveTo(68.0f, 202.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, true, 30.0f, -30.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, true, 68.0f, 202.0f)
                close()
            }
        }
        .build()
        return _circlesThree!!
    }

private var _circlesThree: ImageVector? = null
