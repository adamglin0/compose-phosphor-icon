package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Receipt-thin`: ImageVector
    get() {
        if (`_receipt-thin` != null) {
            return `_receipt-thin`!!
        }
        `_receipt-thin` = Builder(name = "Receipt-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.0f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(80.0f, 108.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(96.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 180.0f, 104.0f)
                close()
                moveTo(176.0f, 132.0f)
                lineTo(80.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(228.0f, 56.0f)
                lineTo(228.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                arcToRelative(4.05f, 4.05f, 0.0f, false, true, -1.79f, -0.42f)
                lineTo(192.0f, 196.47f)
                lineToRelative(-30.21f, 15.11f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.58f, 0.0f)
                lineTo(128.0f, 196.47f)
                lineTo(97.79f, 211.58f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.58f, 0.0f)
                lineTo(64.0f, 196.47f)
                lineTo(33.79f, 211.58f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 28.0f, 208.0f)
                lineTo(28.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 40.0f, 44.0f)
                lineTo(216.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 56.0f)
                close()
                moveTo(220.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(40.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(36.0f, 201.53f)
                lineToRelative(26.21f, -13.11f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.58f, 0.0f)
                lineTo(96.0f, 203.53f)
                lineToRelative(30.21f, -15.11f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.58f, 0.0f)
                lineTo(160.0f, 203.53f)
                lineToRelative(30.21f, -15.11f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.58f, 0.0f)
                lineTo(220.0f, 201.53f)
                close()
            }
        }
        .build()
        return `_receipt-thin`!!
    }

private var `_receipt-thin`: ImageVector? = null
