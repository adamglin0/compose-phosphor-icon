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

public val FillGroup.`Shrimp-fill`: ImageVector
    get() {
        if (`_shrimp-fill` != null) {
            return `_shrimp-fill`!!
        }
        `_shrimp-fill` = Builder(name = "Shrimp-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 136.0f, 116.0f)
                close()
                moveTo(240.0f, 60.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -16.2f, 25.38f)
                arcTo(80.09f, 80.09f, 0.0f, false, true, 144.0f, 160.0f)
                lineTo(112.0f, 160.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(120.0f, 200.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(96.0f, 232.0f)
                arcTo(80.0f, 80.0f, 0.0f, false, true, 96.0f, 72.0f)
                lineTo(212.0f, 72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(128.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, -24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(84.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 240.0f, 60.0f)
                close()
                moveTo(85.72f, 182.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.16f, -1.86f)
                lineToRelative(-15.36f, 11.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.3f, 13.0f)
                lineToRelative(15.36f, -11.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 85.72f, 182.2f)
                close()
                moveTo(84.22f, 146.58f)
                lineTo(45.55f, 129.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -6.62f, 14.56f)
                lineTo(77.6f, 161.15f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 10.59f, -4.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 84.22f, 146.58f)
                close()
                moveTo(207.5f, 88.0f)
                lineTo(120.0f, 88.0f)
                verticalLineToRelative(56.0f)
                horizontalLineToRelative(24.0f)
                arcTo(64.09f, 64.09f, 0.0f, false, false, 207.5f, 88.0f)
                close()
            }
        }
        .build()
        return `_shrimp-fill`!!
    }

private var `_shrimp-fill`: ImageVector? = null
