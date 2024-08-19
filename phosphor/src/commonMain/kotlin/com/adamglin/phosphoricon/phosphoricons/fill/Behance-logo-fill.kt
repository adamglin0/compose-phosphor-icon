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

public val FillGroup.`Behance-logo-fill`: ImageVector
    get() {
        if (`_behance-logo-fill` != null) {
            return `_behance-logo-fill`!!
        }
        `_behance-logo-fill` = Builder(name = "Behance-logo-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(92.0f, 120.0f)
                lineTo(64.0f, 120.0f)
                lineTo(64.0f, 96.0f)
                lineTo(92.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                close()
                moveTo(96.0f, 136.0f)
                lineTo(64.0f, 136.0f)
                verticalLineToRelative(32.0f)
                lineTo(96.0f, 168.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -32.0f)
                close()
                moveTo(176.0f, 120.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -22.62f, 16.0f)
                horizontalLineToRelative(45.24f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 176.0f, 120.0f)
                close()
                moveTo(240.0f, 56.0f)
                lineTo(240.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(32.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(16.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 32.0f, 40.0f)
                lineTo(224.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 240.0f, 56.0f)
                close()
                moveTo(144.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(152.0f, 80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 144.0f, 88.0f)
                close()
                moveTo(128.0f, 152.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -14.13f, -26.53f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 92.0f, 80.0f)
                lineTo(56.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(96.0f, 184.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 128.0f, 152.0f)
                close()
                moveTo(216.0f, 144.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -13.54f, 30.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.59f, -12.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -38.49f, -10.0f)
                lineTo(208.0f, 152.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 144.0f)
                close()
            }
        }
        .build()
        return `_behance-logo-fill`!!
    }

private var `_behance-logo-fill`: ImageVector? = null
