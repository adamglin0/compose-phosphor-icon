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

public val LightGroup.Atom: ImageVector
    get() {
        if (_atom != null) {
            return _atom!!
        }
        _atom = Builder(name = "Atom", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(193.83f, 128.0f)
                arcToRelative(195.73f, 195.73f, 0.0f, false, false, 19.9f, -33.65f)
                curveToRelative(10.74f, -23.88f, 11.0f, -42.66f, 0.8f, -52.88f)
                reflectiveCurveToRelative(-29.0f, -9.94f, -52.88f, 0.8f)
                arcTo(195.73f, 195.73f, 0.0f, false, false, 128.0f, 62.17f)
                arcToRelative(195.73f, 195.73f, 0.0f, false, false, -33.65f, -19.9f)
                curveToRelative(-23.88f, -10.74f, -42.66f, -11.0f, -52.88f, -0.8f)
                reflectiveCurveToRelative(-9.94f, 29.0f, 0.8f, 52.88f)
                arcTo(195.73f, 195.73f, 0.0f, false, false, 62.17f, 128.0f)
                arcToRelative(195.73f, 195.73f, 0.0f, false, false, -19.9f, 33.65f)
                curveToRelative(-10.74f, 23.88f, -11.0f, 42.66f, -0.8f, 52.88f)
                horizontalLineToRelative(0.0f)
                curveToRelative(5.0f, 5.0f, 12.0f, 7.47f, 20.63f, 7.47f)
                curveToRelative(9.1f, 0.0f, 20.0f, -2.76f, 32.25f, -8.27f)
                arcTo(195.73f, 195.73f, 0.0f, false, false, 128.0f, 193.83f)
                arcToRelative(195.73f, 195.73f, 0.0f, false, false, 33.65f, 19.9f)
                curveTo(173.9f, 219.24f, 184.8f, 222.0f, 193.9f, 222.0f)
                curveToRelative(8.64f, 0.0f, 15.65f, -2.49f, 20.63f, -7.47f)
                horizontalLineToRelative(0.0f)
                curveToRelative(10.23f, -10.22f, 9.94f, -29.0f, -0.8f, -52.88f)
                arcTo(195.73f, 195.73f, 0.0f, false, false, 193.83f, 128.0f)
                close()
                moveTo(206.0f, 50.0f)
                curveToRelative(9.28f, 9.28f, 2.36f, 36.29f, -19.8f, 68.0f)
                arcToRelative(306.2f, 306.2f, 0.0f, false, false, -22.78f, -25.45f)
                arcTo(306.2f, 306.2f, 0.0f, false, false, 138.0f, 69.76f)
                curveTo(169.75f, 47.61f, 196.77f, 40.68f, 206.0f, 50.0f)
                close()
                moveTo(178.81f, 128.0f)
                arcTo(289.17f, 289.17f, 0.0f, false, true, 155.0f, 155.0f)
                arcToRelative(289.17f, 289.17f, 0.0f, false, true, -27.0f, 23.88f)
                arcTo(289.17f, 289.17f, 0.0f, false, true, 101.0f, 155.0f)
                arcToRelative(290.62f, 290.62f, 0.0f, false, true, -23.88f, -27.0f)
                arcTo(297.06f, 297.06f, 0.0f, false, true, 128.0f, 77.14f)
                arcTo(290.74f, 290.74f, 0.0f, false, true, 155.0f, 101.0f)
                arcTo(289.17f, 289.17f, 0.0f, false, true, 178.85f, 128.0f)
                close()
                moveTo(50.0f, 50.0f)
                curveToRelative(2.68f, -2.69f, 6.84f, -4.0f, 12.17f, -4.0f)
                curveToRelative(13.11f, 0.0f, 33.3f, 8.0f, 55.87f, 23.81f)
                arcTo(302.94f, 302.94f, 0.0f, false, false, 92.54f, 92.54f)
                arcTo(306.2f, 306.2f, 0.0f, false, false, 69.76f, 118.0f)
                curveTo(47.6f, 86.25f, 40.68f, 59.24f, 50.0f, 50.0f)
                close()
                moveTo(50.0f, 206.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-9.28f, -9.28f, -2.35f, -36.29f, 19.8f, -68.0f)
                arcToRelative(306.2f, 306.2f, 0.0f, false, false, 22.78f, 25.45f)
                arcTo(306.2f, 306.2f, 0.0f, false, false, 118.0f, 186.24f)
                curveTo(86.25f, 208.4f, 59.24f, 215.32f, 50.0f, 206.0f)
                close()
                moveTo(206.0f, 206.0f)
                curveToRelative(-9.28f, 9.28f, -36.29f, 2.35f, -68.0f, -19.81f)
                arcToRelative(304.26f, 304.26f, 0.0f, false, false, 25.45f, -22.77f)
                arcTo(306.2f, 306.2f, 0.0f, false, false, 186.24f, 138.0f)
                curveTo(208.4f, 169.75f, 215.32f, 196.76f, 206.0f, 206.0f)
                close()
                moveTo(138.0f, 128.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 138.0f, 128.0f)
                close()
            }
        }
        .build()
        return _atom!!
    }

private var _atom: ImageVector? = null
