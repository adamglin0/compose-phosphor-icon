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

public val LightGroup.DropHalf: ImageVector
    get() {
        if (_dropHalf != null) {
            return _dropHalf!!
        }
        _dropHalf = Builder(name = "DropHalf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                moveTo(202.0f, 144.0f)
                arcToRelative(75.0f, 75.0f, 0.0f, false, true, -0.69f, 10.0f)
                lineTo(134.0f, 154.0f)
                lineTo(134.0f, 134.0f)
                horizontalLineToRelative(67.44f)
                arcTo(92.09f, 92.09f, 0.0f, false, true, 202.0f, 144.0f)
                close()
                moveTo(186.8f, 90.0f)
                lineTo(134.0f, 90.0f)
                lineTo(134.0f, 70.0f)
                horizontalLineToRelative(39.89f)
                arcTo(176.0f, 176.0f, 0.0f, false, true, 186.8f, 90.0f)
                close()
                moveTo(134.0f, 198.0f)
                horizontalLineToRelative(44.52f)
                arcTo(73.76f, 73.76f, 0.0f, false, true, 134.0f, 217.74f)
                close()
                moveTo(134.0f, 186.0f)
                lineTo(134.0f, 166.0f)
                horizontalLineToRelative(64.66f)
                arcToRelative(74.05f, 74.05f, 0.0f, false, true, -9.78f, 20.0f)
                close()
                moveTo(134.0f, 122.0f)
                lineTo(134.0f, 102.0f)
                horizontalLineToRelative(58.7f)
                arcToRelative(117.43f, 117.43f, 0.0f, false, true, 6.69f, 20.0f)
                close()
                moveTo(164.29f, 58.0f)
                lineTo(134.0f, 58.0f)
                lineTo(134.0f, 28.3f)
                arcTo(257.09f, 257.09f, 0.0f, false, true, 164.29f, 58.0f)
                close()
                moveTo(54.0f, 144.0f)
                curveToRelative(0.0f, -53.42f, 47.35f, -98.56f, 68.0f, -115.7f)
                lineTo(122.0f, 217.74f)
                arcTo(74.09f, 74.09f, 0.0f, false, true, 54.0f, 144.0f)
                close()
            }
        }
        .build()
        return _dropHalf!!
    }

private var _dropHalf: ImageVector? = null
