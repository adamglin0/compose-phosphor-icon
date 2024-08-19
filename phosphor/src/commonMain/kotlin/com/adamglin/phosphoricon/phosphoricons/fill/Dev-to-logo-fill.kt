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

public val FillGroup.`Dev-to-logo-fill`: ImageVector
    get() {
        if (`_dev-to-logo-fill` != null) {
            return `_dev-to-logo-fill`!!
        }
        `_dev-to-logo-fill` = Builder(name = "Dev-to-logo-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.0f, 120.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(64.0f, 104.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 80.0f, 120.0f)
                close()
                moveTo(248.0f, 72.0f)
                lineTo(248.0f, 184.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(24.0f, 200.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 8.0f, 184.0f)
                lineTo(8.0f, 72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 24.0f, 56.0f)
                lineTo(232.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 248.0f, 72.0f)
                close()
                moveTo(96.0f, 120.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 64.0f, 88.0f)
                lineTo(56.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f)
                close()
                moveTo(128.0f, 120.0f)
                lineTo(128.0f, 104.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(120.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(128.0f, 152.0f)
                lineTo(128.0f, 136.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(210.17f, 88.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.87f, 5.53f)
                lineTo(190.0f, 130.45f)
                lineTo(179.7f, 93.83f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -15.4f, 4.34f)
                lineToRelative(18.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 15.4f, 0.0f)
                lineToRelative(18.0f, -64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 210.17f, 88.3f)
                close()
            }
        }
        .build()
        return `_dev-to-logo-fill`!!
    }

private var `_dev-to-logo-fill`: ImageVector? = null
