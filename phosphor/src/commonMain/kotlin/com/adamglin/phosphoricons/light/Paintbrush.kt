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

public val LightGroup.PaintBrush: ImageVector
    get() {
        if (_paintBrush != null) {
            return _paintBrush!!
        }
        _paintBrush = Builder(name = "PaintBrush", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 26.0f)
                curveToRelative(-20.8f, 0.0f, -44.11f, 11.41f, -69.3f, 33.9f)
                curveTo(136.62f, 76.06f, 121.0f, 94.9f, 110.3f, 109.0f)
                arcTo(58.0f, 58.0f, 0.0f, false, false, 34.0f, 164.0f)
                curveToRelative(0.0f, 32.07f, -20.43f, 46.39f, -21.35f, 47.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 16.0f, 222.0f)
                lineTo(92.0f, 222.0f)
                arcToRelative(58.0f, 58.0f, 0.0f, false, false, 55.0f, -76.3f)
                curveToRelative(14.08f, -10.67f, 32.92f, -26.32f, 49.08f, -44.4f)
                curveTo(218.59f, 76.11f, 230.0f, 52.8f, 230.0f, 32.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 224.0f, 26.0f)
                close()
                moveTo(92.0f, 210.0f)
                lineTo(30.65f, 210.0f)
                curveTo(37.92f, 200.85f, 46.0f, 185.78f, 46.0f, 164.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, true, 46.0f, 46.0f)
                close()
                moveTo(121.49f, 114.09f)
                curveToRelative(3.6f, -4.67f, 7.88f, -10.0f, 12.71f, -15.69f)
                arcToRelative(78.17f, 78.17f, 0.0f, false, true, 23.4f, 23.4f)
                curveToRelative(-5.67f, 4.83f, -11.0f, 9.11f, -15.69f, 12.71f)
                arcTo(58.38f, 58.38f, 0.0f, false, false, 121.49f, 114.09f)
                close()
                moveTo(166.69f, 113.79f)
                arcToRelative(90.24f, 90.24f, 0.0f, false, false, -24.48f, -24.48f)
                curveTo(163.05f, 66.46f, 191.0f, 42.0f, 217.56f, 38.44f)
                curveTo(214.0f, 65.0f, 189.54f, 93.0f, 166.69f, 113.79f)
                close()
            }
        }
        .build()
        return _paintBrush!!
    }

private var _paintBrush: ImageVector? = null
