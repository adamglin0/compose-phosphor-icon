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

public val FillGroup.`Check-fat-fill`: ImageVector
    get() {
        if (`_check-fat-fill` != null) {
            return `_check-fat-fill`!!
        }
        `_check-fat-fill` = Builder(name = "Check-fat-fill", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.31f, 90.91f)
                lineToRelative(-128.4f, 128.4f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.62f, 0.0f)
                lineToRelative(-71.62f, -72.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -22.61f)
                lineToRelative(20.0f, -20.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.58f, 0.0f)
                lineTo(104.0f, 144.22f)
                lineToRelative(96.76f, -95.57f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.59f, 0.0f)
                lineToRelative(19.95f, 19.54f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 243.31f, 90.91f)
                close()
            }
        }
        .build()
        return `_check-fat-fill`!!
    }

private var `_check-fat-fill`: ImageVector? = null
