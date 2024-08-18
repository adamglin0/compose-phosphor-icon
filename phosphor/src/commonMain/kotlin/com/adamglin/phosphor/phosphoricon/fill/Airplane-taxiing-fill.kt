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

public val FillGroup.`Airplane-taxiing-fill`: ImageVector
    get() {
        if (`_airplane-taxiing-fill` != null) {
            return `_airplane-taxiing-fill`!!
        }
        `_airplane-taxiing-fill` = Builder(name = "Airplane-taxiing-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 136.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(61.07f, 168.0f)
                arcToRelative(39.75f, 39.75f, 0.0f, false, true, -38.31f, -28.51f)
                lineTo(8.69f, 92.6f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 24.0f, 72.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.65f, 2.34f)
                lineTo(59.32f, 96.0f)
                lineTo(81.81f, 96.0f)
                lineToRelative(-9.0f, -26.94f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 88.0f, 48.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.66f, 2.34f)
                lineTo(147.32f, 96.0f)
                lineTo(208.0f, 96.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 248.0f, 136.0f)
                close()
                moveTo(208.0f, 184.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 184.0f)
                close()
                moveTo(112.0f, 184.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 112.0f, 184.0f)
                close()
            }
        }
        .build()
        return `_airplane-taxiing-fill`!!
    }

private var `_airplane-taxiing-fill`: ImageVector? = null
