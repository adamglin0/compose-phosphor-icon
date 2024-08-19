package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Listnumbers: ImageVector
    get() {
        if (_listnumbers != null) {
            return _listnumbers!!
        }
        _listnumbers = Builder(name = "Listnumbers", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(116.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(216.0f, 116.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 128.0f)
                close()
                moveTo(116.0f, 76.0f)
                lineTo(216.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(116.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                close()
                moveTo(216.0f, 180.0f)
                lineTo(116.0f, 180.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(216.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(44.0f, 59.31f)
                lineTo(44.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(68.0f, 40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 50.64f, 29.27f)
                lineToRelative(-16.0f, 8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.36f, 22.0f)
                close()
                moveTo(83.73f, 156.17f)
                arcToRelative(27.7f, 27.7f, 0.0f, false, false, -11.2f, -18.63f)
                arcTo(28.89f, 28.89f, 0.0f, false, false, 32.9f, 143.0f)
                arcToRelative(27.71f, 27.71f, 0.0f, false, false, -4.17f, 7.54f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 22.55f, 8.21f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.58f, -1.0f)
                arcToRelative(4.78f, 4.78f, 0.0f, false, true, 6.5f, -0.82f)
                arcToRelative(3.82f, 3.82f, 0.0f, false, true, 1.61f, 2.6f)
                arcToRelative(3.63f, 3.63f, 0.0f, false, true, -0.77f, 2.77f)
                lineToRelative(-0.13f, 0.17f)
                lineTo(30.39f, 200.82f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 40.0f, 220.0f)
                lineTo(72.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(64.0f, 196.0f)
                lineToRelative(14.28f, -19.11f)
                arcTo(27.48f, 27.48f, 0.0f, false, false, 83.73f, 156.17f)
                close()
            }
        }
        .build()
        return _listnumbers!!
    }

private var _listnumbers: ImageVector? = null
