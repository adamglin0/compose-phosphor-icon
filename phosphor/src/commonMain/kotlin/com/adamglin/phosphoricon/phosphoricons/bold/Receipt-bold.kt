package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Receipt-bold`: ImageVector
    get() {
        if (`_receipt-bold` != null) {
            return `_receipt-bold`!!
        }
        `_receipt-bold` = Builder(name = "Receipt-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(68.0f, 100.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 80.0f, 88.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(80.0f, 112.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 68.0f, 100.0f)
                close()
                moveTo(80.0f, 152.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(80.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                close()
                moveTo(236.0f, 56.0f)
                lineTo(236.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.37f, 10.73f)
                lineTo(192.0f, 205.42f)
                lineToRelative(-26.63f, 13.31f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -10.74f, 0.0f)
                lineTo(128.0f, 205.42f)
                lineToRelative(-26.63f, 13.31f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -10.74f, 0.0f)
                lineTo(64.0f, 205.42f)
                lineTo(37.37f, 218.73f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 20.0f, 208.0f)
                lineTo(20.0f, 56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 40.0f, 36.0f)
                lineTo(216.0f, 36.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 236.0f, 56.0f)
                close()
                moveTo(212.0f, 60.0f)
                lineTo(44.0f, 60.0f)
                lineTo(44.0f, 188.58f)
                lineToRelative(14.63f, -7.31f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 10.74f, 0.0f)
                lineTo(96.0f, 194.58f)
                lineToRelative(26.63f, -13.31f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 10.74f, 0.0f)
                lineTo(160.0f, 194.58f)
                lineToRelative(26.63f, -13.31f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 10.74f, 0.0f)
                lineTo(212.0f, 188.58f)
                close()
            }
        }
        .build()
        return `_receipt-bold`!!
    }

private var `_receipt-bold`: ImageVector? = null
