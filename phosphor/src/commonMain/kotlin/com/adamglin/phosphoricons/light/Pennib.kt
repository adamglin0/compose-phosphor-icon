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

public val LightGroup.PenNib: ImageVector
    get() {
        if (_penNib != null) {
            return _penNib!!
        }
        _penNib = Builder(name = "PenNib", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.0f, 92.68f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, false, -4.1f, -9.9f)
                lineTo(173.21f, 14.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.8f, 0.0f)
                lineTo(124.68f, 42.83f)
                lineTo(66.22f, 64.76f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -8.9f, 10.8f)
                lineTo(34.08f, 215.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 40.0f, 222.0f)
                arcToRelative(6.61f, 6.61f, 0.0f, false, false, 1.0f, -0.08f)
                lineToRelative(139.44f, -23.24f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 10.81f, -8.9f)
                lineToRelative(21.92f, -58.46f)
                lineToRelative(28.74f, -28.74f)
                arcTo(13.92f, 13.92f, 0.0f, false, false, 246.0f, 92.68f)
                close()
                moveTo(180.0f, 185.57f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.54f, 1.27f)
                lineTo(57.49f, 207.0f)
                lineToRelative(52.87f, -52.88f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, false, -8.48f, -8.48f)
                lineTo(49.0f, 198.53f)
                lineToRelative(20.17f, -121.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 70.43f, 76.0f)
                lineToRelative(56.06f, -21.0f)
                lineTo(201.0f, 129.51f)
                close()
                moveTo(110.0f, 132.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, 14.0f, 14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 110.0f, 132.0f)
                close()
                moveTo(233.41f, 94.1f)
                lineTo(208.0f, 119.51f)
                lineTo(136.48f, 48.0f)
                lineTo(161.9f, 22.58f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.83f, 0.0f)
                lineToRelative(68.68f, 68.69f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 2.83f)
                close()
            }
        }
        .build()
        return _penNib!!
    }

private var _penNib: ImageVector? = null
