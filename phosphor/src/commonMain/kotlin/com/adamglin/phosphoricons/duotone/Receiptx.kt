package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.ReceiptX: ImageVector
    get() {
        if (_receiptX != null) {
            return _receiptX!!
        }
        _receiptX = Builder(name = "ReceiptX", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 56.0f)
                verticalLineTo(208.0f)
                lineToRelative(-32.0f, -16.0f)
                lineToRelative(-32.0f, 16.0f)
                lineToRelative(-32.0f, -16.0f)
                lineTo(96.0f, 208.0f)
                lineTo(64.0f, 192.0f)
                lineTo(32.0f, 208.0f)
                verticalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(216.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 56.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 40.0f)
                lineTo(40.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 56.0f)
                lineTo(24.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.58f, 7.15f)
                lineTo(64.0f, 200.94f)
                lineToRelative(28.42f, 14.21f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.16f, 0.0f)
                lineTo(128.0f, 200.94f)
                lineToRelative(28.42f, 14.21f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.16f, 0.0f)
                lineTo(192.0f, 200.94f)
                lineToRelative(28.42f, 14.21f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 232.0f, 208.0f)
                lineTo(232.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 40.0f)
                close()
                moveTo(216.0f, 195.06f)
                lineTo(195.58f, 184.84f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.16f, 0.0f)
                lineTo(160.0f, 199.06f)
                lineToRelative(-28.42f, -14.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.16f, 0.0f)
                lineTo(96.0f, 199.06f)
                lineTo(67.58f, 184.84f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.16f, 0.0f)
                lineTo(40.0f, 195.06f)
                lineTo(40.0f, 56.0f)
                lineTo(216.0f, 56.0f)
                close()
                moveTo(98.34f, 138.34f)
                lineTo(116.69f, 120.0f)
                lineTo(98.34f, 101.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineTo(128.0f, 108.69f)
                lineToRelative(18.34f, -18.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                lineTo(139.31f, 120.0f)
                lineToRelative(18.35f, 18.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f)
                lineTo(128.0f, 131.31f)
                lineToRelative(-18.34f, 18.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                close()
            }
        }
        .build()
        return _receiptX!!
    }

private var _receiptX: ImageVector? = null
