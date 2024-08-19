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

public val LightGroup.Tree: ImageVector
    get() {
        if (_tree != null) {
            return _tree!!
        }
        _tree = Builder(name = "Tree", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(196.55f, 64.09f)
                arcToRelative(74.0f, 74.0f, 0.0f, false, false, -137.1f, 0.0f)
                arcTo(69.71f, 69.71f, 0.0f, false, false, 18.0f, 127.8f)
                curveTo(17.9f, 164.91f, 49.13f, 197.0f, 86.19f, 198.0f)
                arcTo(70.32f, 70.32f, 0.0f, false, false, 122.0f, 189.16f)
                verticalLineTo(232.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(189.16f)
                arcTo(70.1f, 70.1f, 0.0f, false, false, 168.0f, 198.0f)
                lineToRelative(1.77f, 0.0f)
                curveTo(206.87f, 197.0f, 238.1f, 164.9f, 238.0f, 127.8f)
                arcTo(69.71f, 69.71f, 0.0f, false, false, 196.55f, 64.09f)
                close()
                moveTo(169.5f, 186.0f)
                arcTo(57.88f, 57.88f, 0.0f, false, true, 134.0f, 175.0f)
                verticalLineTo(131.71f)
                lineToRelative(44.68f, -22.34f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -5.36f, -10.74f)
                lineTo(134.0f, 118.29f)
                verticalLineTo(88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(54.29f)
                lineTo(82.68f, 122.63f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.36f, 10.74f)
                lineTo(122.0f, 155.71f)
                verticalLineTo(175.0f)
                arcToRelative(58.09f, 58.09f, 0.0f, false, true, -35.5f, 11.0f)
                curveToRelative(-30.71f, -0.77f, -56.58f, -27.4f, -56.5f, -58.14f)
                arcTo(57.78f, 57.78f, 0.0f, false, true, 66.37f, 74.19f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.39f, -3.51f)
                arcToRelative(62.0f, 62.0f, 0.0f, false, true, 116.48f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.39f, 3.51f)
                arcTo(57.77f, 57.77f, 0.0f, false, true, 226.0f, 127.83f)
                curveTo(226.08f, 158.58f, 200.21f, 185.2f, 169.5f, 186.0f)
                close()
            }
        }
        .build()
        return _tree!!
    }

private var _tree: ImageVector? = null
