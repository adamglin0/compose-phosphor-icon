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

public val LightGroup.Bellsimpleringing: ImageVector
    get() {
        if (_bellsimpleringing != null) {
            return _bellsimpleringing!!
        }
        _bellsimpleringing = Builder(name = "Bellsimpleringing", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(165.92f, 224.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                horizontalLineToRelative(-64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(64.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 165.92f, 224.0f)
                close()
                moveTo(225.61f, 61.23f)
                arcToRelative(109.23f, 109.23f, 0.0f, false, false, -38.41f, -42.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.4f, 10.14f)
                arcTo(96.0f, 96.0f, 0.0f, false, true, 215.0f, 66.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 10.65f, -5.53f)
                close()
                moveTo(41.0f, 66.76f)
                arcTo(96.0f, 96.0f, 0.0f, false, true, 75.2f, 29.07f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.4f, -10.14f)
                arcToRelative(109.23f, 109.23f, 0.0f, false, false, -38.41f, 42.3f)
                arcTo(6.0f, 6.0f, 0.0f, true, false, 41.0f, 66.76f)
                close()
                moveTo(220.0f, 176.93f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 208.0f, 198.0f)
                lineTo(48.0f, 198.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -12.06f, -21.0f)
                curveTo(45.13f, 161.08f, 50.0f, 138.62f, 50.0f, 112.0f)
                arcToRelative(78.0f, 78.0f, 0.0f, false, true, 156.0f, 0.0f)
                curveTo(206.0f, 139.0f, 210.74f, 160.84f, 220.08f, 176.93f)
                close()
                moveTo(209.63f, 182.93f)
                curveTo(199.29f, 165.0f, 194.0f, 141.14f, 194.0f, 112.0f)
                arcToRelative(66.0f, 66.0f, 0.0f, false, false, -132.0f, 0.0f)
                curveToRelative(0.0f, 29.16f, -5.29f, 53.0f, -15.71f, 71.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, 1.7f, 1.0f)
                lineTo(208.0f, 186.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, 1.7f, -1.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 209.71f, 183.0f)
                close()
            }
        }
        .build()
        return _bellsimpleringing!!
    }

private var _bellsimpleringing: ImageVector? = null
