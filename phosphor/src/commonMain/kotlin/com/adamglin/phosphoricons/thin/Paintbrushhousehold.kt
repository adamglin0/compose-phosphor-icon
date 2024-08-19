package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Paintbrushhousehold: ImageVector
    get() {
        if (_paintbrushhousehold != null) {
            return _paintbrushhousehold!!
        }
        _paintbrushhousehold = Builder(name = "Paintbrushhousehold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.81f, 28.19f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -39.6f, 0.0f)
                lineToRelative(-0.21f, 0.23f)
                lineTo(131.78f, 94.11f)
                lineTo(118.15f, 80.48f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.29f, 0.0f)
                lineTo(13.17f, 157.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 5.65f)
                lineToRelative(80.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.65f, 0.0f)
                lineToRelative(76.69f, -76.69f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, -28.29f)
                lineToRelative(-13.63f, -13.63f)
                lineTo(227.58f, 68.0f)
                lineToRelative(0.23f, -0.21f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 227.81f, 28.19f)
                close()
                moveTo(96.0f, 234.34f)
                lineTo(73.66f, 212.0f)
                lineToRelative(25.17f, -25.18f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.65f, -5.65f)
                lineTo(68.0f, 206.34f)
                lineTo(49.66f, 188.0f)
                lineToRelative(25.17f, -25.18f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.65f, -5.65f)
                lineTo(44.0f, 182.34f)
                lineTo(21.66f, 160.0f)
                lineTo(72.0f, 109.65f)
                lineTo(146.35f, 184.0f)
                close()
                moveTo(222.26f, 62.0f)
                lineTo(153.41f, 121.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.23f, 5.87f)
                lineToRelative(16.69f, 16.69f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                lineTo(152.0f, 178.34f)
                lineTo(77.66f, 104.0f)
                lineTo(95.52f, 86.13f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 0.0f)
                lineToRelative(16.69f, 16.69f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.87f, -0.23f)
                lineTo(194.0f, 33.74f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 222.26f, 62.0f)
                close()
            }
        }
        .build()
        return _paintbrushhousehold!!
    }

private var _paintbrushhousehold: ImageVector? = null
