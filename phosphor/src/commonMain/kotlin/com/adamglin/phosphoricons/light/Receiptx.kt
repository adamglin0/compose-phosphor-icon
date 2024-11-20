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

public val LightGroup.ReceiptX: ImageVector
    get() {
        if (_receiptX != null) {
            return _receiptX!!
        }
        _receiptX = Builder(name = "ReceiptX", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 42.0f)
                lineTo(40.0f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 56.0f)
                lineTo(26.0f, 208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.68f, 5.37f)
                lineTo(64.0f, 198.71f)
                lineToRelative(29.32f, 14.66f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.36f, 0.0f)
                lineTo(128.0f, 198.71f)
                lineToRelative(29.32f, 14.66f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.36f, 0.0f)
                lineTo(192.0f, 198.71f)
                lineToRelative(29.32f, 14.66f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 224.0f, 214.0f)
                arcToRelative(5.93f, 5.93f, 0.0f, false, false, 3.15f, -0.9f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 230.0f, 208.0f)
                lineTo(230.0f, 56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 216.0f, 42.0f)
                close()
                moveTo(218.0f, 198.29f)
                lineTo(194.68f, 186.63f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.36f, 0.0f)
                lineTo(160.0f, 201.29f)
                lineToRelative(-29.32f, -14.66f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.36f, 0.0f)
                lineTo(96.0f, 201.29f)
                lineTo(66.68f, 186.63f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.36f, 0.0f)
                lineTo(38.0f, 198.29f)
                lineTo(38.0f, 56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(216.0f, 54.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(156.24f, 100.29f)
                lineTo(136.48f, 120.0f)
                lineToRelative(19.76f, 19.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.48f, 8.48f)
                lineTo(128.0f, 128.48f)
                lineToRelative(-19.76f, 19.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f)
                lineTo(119.52f, 120.0f)
                lineTo(99.76f, 100.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f)
                lineTo(128.0f, 111.52f)
                lineToRelative(19.76f, -19.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 8.48f)
                close()
            }
        }
        .build()
        return _receiptX!!
    }

private var _receiptX: ImageVector? = null
