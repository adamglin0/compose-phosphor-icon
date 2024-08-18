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

public val FillGroup.`Arrows-out-line-horizontal-fill`: ImageVector
    get() {
        if (`_arrows-out-line-horizontal-fill` != null) {
            return `_arrows-out-line-horizontal-fill`!!
        }
        `_arrows-out-line-horizontal-fill` = Builder(name = "Arrows-out-line-horizontal-fill",
                defaultWidth = 256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f,
                viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(104.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(56.0f, 136.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.66f, 5.66f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -11.32f)
                lineToRelative(32.0f, -32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 56.0f, 96.0f)
                verticalLineToRelative(24.0f)
                lineTo(96.0f, 120.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 104.0f, 128.0f)
                close()
                moveTo(245.66f, 122.34f)
                lineTo(213.66f, 90.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 200.0f, 96.0f)
                verticalLineToRelative(24.0f)
                lineTo(160.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.66f, 5.66f)
                lineToRelative(32.0f, -32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 245.66f, 122.34f)
                close()
                moveTo(128.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(120.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(136.0f, 40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 32.0f)
                close()
            }
        }
        .build()
        return `_arrows-out-line-horizontal-fill`!!
    }

private var `_arrows-out-line-horizontal-fill`: ImageVector? = null
