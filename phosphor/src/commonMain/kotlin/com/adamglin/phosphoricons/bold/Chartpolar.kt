package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Chartpolar: ImageVector
    get() {
        if (_chartpolar != null) {
            return _chartpolar!!
        }
        _chartpolar = Builder(name = "Chartpolar", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(211.13f, 116.0f)
                lineTo(194.92f, 116.0f)
                arcTo(68.16f, 68.16f, 0.0f, false, false, 140.0f, 61.08f)
                lineTo(140.0f, 44.87f)
                arcTo(84.18f, 84.18f, 0.0f, false, true, 211.13f, 116.0f)
                close()
                moveTo(116.0f, 116.0f)
                lineTo(85.68f, 116.0f)
                arcTo(44.13f, 44.13f, 0.0f, false, true, 116.0f, 85.68f)
                close()
                moveTo(116.0f, 140.0f)
                verticalLineToRelative(30.32f)
                arcTo(44.13f, 44.13f, 0.0f, false, true, 85.68f, 140.0f)
                close()
                moveTo(140.0f, 140.0f)
                horizontalLineToRelative(30.32f)
                arcTo(44.13f, 44.13f, 0.0f, false, true, 140.0f, 170.32f)
                close()
                moveTo(140.0f, 116.0f)
                lineTo(140.0f, 85.68f)
                arcTo(44.13f, 44.13f, 0.0f, false, true, 170.32f, 116.0f)
                close()
                moveTo(116.0f, 44.87f)
                lineTo(116.0f, 61.08f)
                arcTo(68.16f, 68.16f, 0.0f, false, false, 61.08f, 116.0f)
                lineTo(44.87f, 116.0f)
                arcTo(84.18f, 84.18f, 0.0f, false, true, 116.0f, 44.87f)
                close()
                moveTo(44.87f, 140.0f)
                lineTo(61.08f, 140.0f)
                arcTo(68.16f, 68.16f, 0.0f, false, false, 116.0f, 194.92f)
                verticalLineToRelative(16.21f)
                arcTo(84.18f, 84.18f, 0.0f, false, true, 44.87f, 140.0f)
                close()
                moveTo(140.0f, 211.13f)
                lineTo(140.0f, 194.92f)
                arcTo(68.16f, 68.16f, 0.0f, false, false, 194.92f, 140.0f)
                horizontalLineToRelative(16.21f)
                arcTo(84.18f, 84.18f, 0.0f, false, true, 140.0f, 211.13f)
                close()
            }
        }
        .build()
        return _chartpolar!!
    }

private var _chartpolar: ImageVector? = null
