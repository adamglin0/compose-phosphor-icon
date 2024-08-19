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

public val BoldGroup.Receiptx: ImageVector
    get() {
        if (_receiptx != null) {
            return _receiptx!!
        }
        _receiptx = Builder(name = "Receiptx", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 36.0f)
                lineTo(40.0f, 36.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 56.0f)
                lineTo(20.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.37f, 10.73f)
                lineTo(64.0f, 205.42f)
                lineToRelative(26.63f, 13.31f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.74f, 0.0f)
                lineTo(128.0f, 205.42f)
                lineToRelative(26.63f, 13.31f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.74f, 0.0f)
                lineTo(192.0f, 205.42f)
                lineToRelative(26.63f, 13.31f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 236.0f, 208.0f)
                lineTo(236.0f, 56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 216.0f, 36.0f)
                close()
                moveTo(212.0f, 188.58f)
                lineTo(197.37f, 181.27f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.74f, 0.0f)
                lineTo(160.0f, 194.58f)
                lineToRelative(-26.63f, -13.31f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.74f, 0.0f)
                lineTo(96.0f, 194.58f)
                lineTo(69.37f, 181.27f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.74f, 0.0f)
                lineTo(44.0f, 188.58f)
                lineTo(44.0f, 60.0f)
                lineTo(212.0f, 60.0f)
                close()
                moveTo(95.51f, 135.51f)
                lineTo(111.0f, 120.0f)
                lineTo(95.51f, 104.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineTo(128.0f, 103.0f)
                lineToRelative(15.51f, -15.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                lineTo(145.0f, 120.0f)
                lineToRelative(15.52f, 15.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 17.0f)
                lineTo(128.0f, 137.0f)
                lineToRelative(-15.51f, 15.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                close()
            }
        }
        .build()
        return _receiptx!!
    }

private var _receiptx: ImageVector? = null
