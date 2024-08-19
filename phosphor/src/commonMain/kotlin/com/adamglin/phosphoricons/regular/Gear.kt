package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Gear: ImageVector
    get() {
        if (_gear != null) {
            return _gear!!
        }
        _gear = Builder(name = "Gear", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 80.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 48.0f, 48.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, false, 128.0f, 80.0f)
                close()
                moveTo(128.0f, 160.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 128.0f, 160.0f)
                close()
                moveTo(216.0f, 130.16f)
                quadToRelative(0.06f, -2.16f, 0.0f, -4.32f)
                lineToRelative(14.92f, -18.64f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.48f, -7.06f)
                arcToRelative(107.21f, 107.21f, 0.0f, false, false, -10.88f, -26.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.0f, -3.93f)
                lineToRelative(-23.72f, -2.64f)
                quadToRelative(-1.48f, -1.56f, -3.0f, -3.0f)
                lineTo(186.0f, 40.54f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.94f, -6.0f)
                arcToRelative(107.71f, 107.71f, 0.0f, false, false, -26.25f, -10.87f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.06f, 1.49f)
                lineTo(130.16f, 40.0f)
                quadTo(128.0f, 40.0f, 125.84f, 40.0f)
                lineTo(107.2f, 25.11f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.06f, -1.48f)
                arcTo(107.6f, 107.6f, 0.0f, false, false, 73.89f, 34.51f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.93f, 6.0f)
                lineTo(67.32f, 64.27f)
                quadToRelative(-1.56f, 1.49f, -3.0f, 3.0f)
                lineTo(40.54f, 70.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.0f, 3.94f)
                arcToRelative(107.71f, 107.71f, 0.0f, false, false, -10.87f, 26.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.49f, 7.06f)
                lineTo(40.0f, 125.84f)
                quadTo(40.0f, 128.0f, 40.0f, 130.16f)
                lineTo(25.11f, 148.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -1.48f, 7.06f)
                arcToRelative(107.21f, 107.21f, 0.0f, false, false, 10.88f, 26.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.0f, 3.93f)
                lineToRelative(23.72f, 2.64f)
                quadToRelative(1.49f, 1.56f, 3.0f, 3.0f)
                lineTo(70.0f, 215.46f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.94f, 6.0f)
                arcToRelative(107.71f, 107.71f, 0.0f, false, false, 26.25f, 10.87f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.06f, -1.49f)
                lineTo(125.84f, 216.0f)
                quadToRelative(2.16f, 0.06f, 4.32f, 0.0f)
                lineToRelative(18.64f, 14.92f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.06f, 1.48f)
                arcToRelative(107.21f, 107.21f, 0.0f, false, false, 26.25f, -10.88f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.93f, -6.0f)
                lineToRelative(2.64f, -23.72f)
                quadToRelative(1.56f, -1.48f, 3.0f, -3.0f)
                lineTo(215.46f, 186.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.0f, -3.94f)
                arcToRelative(107.71f, 107.71f, 0.0f, false, false, 10.87f, -26.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -1.49f, -7.06f)
                close()
                moveTo(199.9f, 123.66f)
                arcToRelative(73.93f, 73.93f, 0.0f, false, true, 0.0f, 8.68f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.74f, 5.48f)
                lineToRelative(14.19f, 17.73f)
                arcToRelative(91.57f, 91.57f, 0.0f, false, true, -6.23f, 15.0f)
                lineTo(187.0f, 173.11f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.1f, 2.64f)
                arcToRelative(74.11f, 74.11f, 0.0f, false, true, -6.14f, 6.14f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.64f, 5.1f)
                lineToRelative(-2.51f, 22.58f)
                arcToRelative(91.32f, 91.32f, 0.0f, false, true, -15.0f, 6.23f)
                lineToRelative(-17.74f, -14.19f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.0f, -1.75f)
                horizontalLineToRelative(-0.48f)
                arcToRelative(73.93f, 73.93f, 0.0f, false, true, -8.68f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.48f, 1.74f)
                lineTo(100.45f, 215.8f)
                arcToRelative(91.57f, 91.57f, 0.0f, false, true, -15.0f, -6.23f)
                lineTo(82.89f, 187.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.64f, -5.1f)
                arcToRelative(74.11f, 74.11f, 0.0f, false, true, -6.14f, -6.14f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.1f, -2.64f)
                lineTo(46.43f, 170.6f)
                arcToRelative(91.32f, 91.32f, 0.0f, false, true, -6.23f, -15.0f)
                lineToRelative(14.19f, -17.74f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.74f, -5.48f)
                arcToRelative(73.93f, 73.93f, 0.0f, false, true, 0.0f, -8.68f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -1.74f, -5.48f)
                lineTo(40.2f, 100.45f)
                arcToRelative(91.57f, 91.57f, 0.0f, false, true, 6.23f, -15.0f)
                lineTo(69.0f, 82.89f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.1f, -2.64f)
                arcToRelative(74.11f, 74.11f, 0.0f, false, true, 6.14f, -6.14f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 82.89f, 69.0f)
                lineTo(85.4f, 46.43f)
                arcToRelative(91.32f, 91.32f, 0.0f, false, true, 15.0f, -6.23f)
                lineToRelative(17.74f, 14.19f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.48f, 1.74f)
                arcToRelative(73.93f, 73.93f, 0.0f, false, true, 8.68f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.48f, -1.74f)
                lineTo(155.55f, 40.2f)
                arcToRelative(91.57f, 91.57f, 0.0f, false, true, 15.0f, 6.23f)
                lineTo(173.11f, 69.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.64f, 5.1f)
                arcToRelative(74.11f, 74.11f, 0.0f, false, true, 6.14f, 6.14f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.1f, 2.64f)
                lineToRelative(22.58f, 2.51f)
                arcToRelative(91.32f, 91.32f, 0.0f, false, true, 6.23f, 15.0f)
                lineToRelative(-14.19f, 17.74f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 199.87f, 123.66f)
                close()
            }
        }
        .build()
        return _gear!!
    }

private var _gear: ImageVector? = null
