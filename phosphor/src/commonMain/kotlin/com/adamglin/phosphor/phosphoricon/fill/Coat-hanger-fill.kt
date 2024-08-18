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

public val FillGroup.`Coat-hanger-fill`: ImageVector
    get() {
        if (`_coat-hanger-fill` != null) {
            return `_coat-hanger-fill`!!
        }
        `_coat-hanger-fill` = Builder(name = "Coat-hanger-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(241.57f, 171.2f)
                lineTo(141.33f, 96.0f)
                lineToRelative(23.46f, -17.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 168.0f, 72.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -80.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 47.69f, -3.78f)
                lineTo(14.43f, 171.2f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 200.0f)
                horizontalLineTo(232.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 9.6f, -28.8f)
                close()
                moveTo(32.73f, 184.0f)
                curveTo(53.6f, 170.59f, 89.49f, 152.0f, 128.0f, 152.0f)
                reflectiveCurveToRelative(74.4f, 18.59f, 95.27f, 32.0f)
                close()
            }
        }
        .build()
        return `_coat-hanger-fill`!!
    }

private var `_coat-hanger-fill`: ImageVector? = null
