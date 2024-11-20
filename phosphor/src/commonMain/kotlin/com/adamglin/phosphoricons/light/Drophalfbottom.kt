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

public val LightGroup.DropHalfBottom: ImageVector
    get() {
        if (_dropHalfBottom != null) {
            return _dropHalfBottom!!
        }
        _dropHalfBottom = Builder(name = "DropHalfBottom", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.53f, 49.06f)
                arcToRelative(251.42f, 251.42f, 0.0f, false, false, -41.09f, -38.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.88f, 0.0f)
                arcToRelative(251.42f, 251.42f, 0.0f, false, false, -41.09f, 38.0f)
                curveTo(56.34f, 80.26f, 42.0f, 113.09f, 42.0f, 144.0f)
                arcToRelative(86.0f, 86.0f, 0.0f, false, false, 172.0f, 0.0f)
                curveTo(214.0f, 113.09f, 199.66f, 80.26f, 172.53f, 49.06f)
                close()
                moveTo(188.88f, 186.0f)
                horizontalLineTo(67.12f)
                arcToRelative(74.05f, 74.05f, 0.0f, false, true, -9.78f, -20.0f)
                horizontalLineTo(198.66f)
                arcTo(74.05f, 74.05f, 0.0f, false, true, 188.88f, 186.0f)
                close()
                moveTo(54.69f, 154.0f)
                arcTo(75.0f, 75.0f, 0.0f, false, true, 54.0f, 144.0f)
                arcToRelative(92.09f, 92.09f, 0.0f, false, true, 0.56f, -10.0f)
                horizontalLineTo(201.44f)
                arcToRelative(92.09f, 92.09f, 0.0f, false, true, 0.56f, 10.0f)
                arcToRelative(75.0f, 75.0f, 0.0f, false, true, -0.69f, 10.0f)
                close()
                moveTo(128.0f, 23.49f)
                curveToRelative(13.13f, 10.12f, 59.83f, 49.06f, 71.39f, 98.51f)
                horizontalLineTo(56.61f)
                curveTo(68.17f, 72.55f, 114.87f, 33.61f, 128.0f, 23.49f)
                close()
                moveTo(77.48f, 198.0f)
                horizontalLineToRelative(101.0f)
                arcToRelative(73.81f, 73.81f, 0.0f, false, true, -101.0f, 0.0f)
                close()
            }
        }
        .build()
        return _dropHalfBottom!!
    }

private var _dropHalfBottom: ImageVector? = null
