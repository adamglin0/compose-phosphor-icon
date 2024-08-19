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

public val FillGroup.`Warehouse-fill`: ImageVector
    get() {
        if (`_warehouse-fill` != null) {
            return `_warehouse-fill`!!
        }
        `_warehouse-fill` = Builder(name = "Warehouse-fill", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 184.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(232.0f, 57.9f)
                lineToRelative(9.67f, -2.08f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -3.35f, -15.64f)
                lineToRelative(-224.0f, 48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 16.0f, 104.0f)
                arcToRelative(8.16f, 8.16f, 0.0f, false, false, 1.69f, -0.18f)
                lineTo(24.0f, 102.47f)
                lineTo(24.0f, 184.0f)
                lineTo(16.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(240.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(184.0f, 184.0f)
                lineTo(72.0f, 184.0f)
                lineTo(72.0f, 168.0f)
                lineTo(184.0f, 168.0f)
                close()
                moveTo(184.0f, 152.0f)
                lineTo(72.0f, 152.0f)
                lineTo(72.0f, 136.0f)
                lineTo(184.0f, 136.0f)
                close()
            }
        }
        .build()
        return `_warehouse-fill`!!
    }

private var `_warehouse-fill`: ImageVector? = null
