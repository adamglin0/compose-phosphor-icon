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

public val FillGroup.`Microsoft-excel-logo-fill`: ImageVector
    get() {
        if (`_microsoft-excel-logo-fill` != null) {
            return `_microsoft-excel-logo-fill`!!
        }
        `_microsoft-excel-logo-fill` = Builder(name = "Microsoft-excel-logo-fill", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 24.0f)
                lineTo(72.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 56.0f, 40.0f)
                lineTo(56.0f, 64.0f)
                lineTo(40.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(56.0f, 192.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(200.0f, 232.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(216.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 200.0f, 24.0f)
                close()
                moveTo(72.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.15f, -13.12f)
                lineTo(81.59f, 128.0f)
                lineTo(65.85f, 109.12f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.3f, -10.24f)
                lineTo(92.0f, 115.5f)
                lineToRelative(13.85f, -16.62f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 12.3f, 10.24f)
                lineTo(102.41f, 128.0f)
                lineToRelative(15.74f, 18.88f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.3f, 10.24f)
                lineTo(92.0f, 140.5f)
                lineTo(78.15f, 157.12f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 72.0f, 160.0f)
                close()
                moveTo(128.0f, 216.0f)
                lineTo(72.0f, 216.0f)
                lineTo(72.0f, 192.0f)
                horizontalLineToRelative(56.0f)
                close()
                moveTo(128.0f, 64.0f)
                lineTo(72.0f, 64.0f)
                lineTo(72.0f, 40.0f)
                horizontalLineToRelative(56.0f)
                close()
                moveTo(200.0f, 216.0f)
                lineTo(144.0f, 216.0f)
                lineTo(144.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(40.0f)
                close()
                moveTo(200.0f, 152.0f)
                lineTo(160.0f, 152.0f)
                lineTo(160.0f, 104.0f)
                horizontalLineToRelative(40.0f)
                close()
                moveTo(200.0f, 88.0f)
                lineTo(160.0f, 88.0f)
                lineTo(160.0f, 80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(144.0f, 40.0f)
                horizontalLineToRelative(56.0f)
                close()
            }
        }
        .build()
        return `_microsoft-excel-logo-fill`!!
    }

private var `_microsoft-excel-logo-fill`: ImageVector? = null
