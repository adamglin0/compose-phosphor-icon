package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Address-book-fill`: ImageVector
    get() {
        if (`_address-book-fill` != null) {
            return `_address-book-fill`!!
        }
        `_address-book-fill` = Builder(name = "Address-book-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 112.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 160.0f, 112.0f)
                close()
                moveTo(224.0f, 40.0f)
                lineTo(224.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(64.0f, 232.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(48.0f, 192.0f)
                lineTo(32.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(48.0f, 176.0f)
                lineTo(48.0f, 136.0f)
                lineTo(32.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(48.0f, 120.0f)
                lineTo(48.0f, 80.0f)
                lineTo(32.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(48.0f, 64.0f)
                lineTo(48.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 64.0f, 24.0f)
                lineTo(208.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 40.0f)
                close()
                moveTo(190.4f, 163.2f)
                arcTo(67.88f, 67.88f, 0.0f, false, false, 163.0f, 141.51f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -53.94f, 0.0f)
                arcTo(67.88f, 67.88f, 0.0f, false, false, 81.6f, 163.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 12.8f, 9.6f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, 83.2f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 12.8f, -9.6f)
                close()
            }
        }
        .build()
        return `_address-book-fill`!!
    }

private var `_address-book-fill`: ImageVector? = null
