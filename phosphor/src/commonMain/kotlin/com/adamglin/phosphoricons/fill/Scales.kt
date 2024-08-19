package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Scales: ImageVector
    get() {
        if (_scales != null) {
            return _scales!!
        }
        _scales = Builder(name = "Scales", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(239.43f, 133.0f)
                lineToRelative(-32.0f, -80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 200.0f, 48.0f)
                arcToRelative(8.27f, 8.27f, 0.0f, false, false, -1.73f, 0.21f)
                lineTo(136.0f, 62.0f)
                lineTo(136.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(120.0f, 65.58f)
                lineTo(54.27f, 80.21f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 48.57f, 85.0f)
                lineToRelative(-32.0f, 80.0f)
                arcToRelative(7.92f, 7.92f, 0.0f, false, false, -0.57f, 3.0f)
                curveToRelative(0.0f, 23.31f, 24.54f, 32.0f, 40.0f, 32.0f)
                reflectiveCurveToRelative(40.0f, -8.69f, 40.0f, -32.0f)
                arcToRelative(7.92f, 7.92f, 0.0f, false, false, -0.57f, -3.0f)
                lineTo(66.92f, 93.77f)
                lineTo(120.0f, 82.0f)
                lineTo(120.0f, 208.0f)
                lineTo(104.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(136.0f, 208.0f)
                lineTo(136.0f, 78.42f)
                lineTo(187.0f, 67.1f)
                lineTo(160.57f, 133.0f)
                arcToRelative(7.92f, 7.92f, 0.0f, false, false, -0.57f, 3.0f)
                curveToRelative(0.0f, 23.31f, 24.54f, 32.0f, 40.0f, 32.0f)
                reflectiveCurveToRelative(40.0f, -8.69f, 40.0f, -32.0f)
                arcTo(7.92f, 7.92f, 0.0f, false, false, 239.43f, 133.0f)
                close()
                moveTo(79.43f, 168.0f)
                lineTo(32.62f, 168.0f)
                lineTo(56.0f, 109.54f)
                close()
                moveTo(176.67f, 136.0f)
                lineTo(200.0f, 77.54f)
                lineTo(223.38f, 136.0f)
                close()
            }
        }
        .build()
        return _scales!!
    }

private var _scales: ImageVector? = null
