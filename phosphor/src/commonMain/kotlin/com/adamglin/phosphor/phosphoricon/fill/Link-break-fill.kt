package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Link-break-fill`: ImageVector
    get() {
        if (`_link-break-fill` != null) {
            return `_link-break-fill`!!
        }
        `_link-break-fill` = Builder(name = "Link-break-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 32.0f)
                lineTo(48.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f)
                lineTo(32.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(208.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f)
                close()
                moveTo(96.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                lineTo(112.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
                moveTo(64.0f, 96.0f)
                lineTo(80.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(64.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                close()
                moveTo(128.08f, 181.66f)
                lineTo(120.87f, 188.87f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, true, -53.74f, -53.74f)
                lineToRelative(7.21f, -7.21f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.32f, 11.31f)
                lineToRelative(-7.22f, 7.21f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 31.12f, 31.12f)
                lineToRelative(7.21f, -7.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.31f, 11.32f)
                close()
                moveTo(160.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(144.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(192.0f, 160.0f)
                lineTo(176.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(188.87f, 120.87f)
                lineTo(181.66f, 128.08f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.32f, -11.31f)
                lineToRelative(7.22f, -7.21f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -31.12f, -31.12f)
                lineToRelative(-7.21f, 7.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.31f, -11.32f)
                lineToRelative(7.21f, -7.21f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, true, 53.74f, 53.74f)
                close()
            }
        }
        .build()
        return `_link-break-fill`!!
    }

private var `_link-break-fill`: ImageVector? = null
