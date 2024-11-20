package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Thermometer: ImageVector
    get() {
        if (_thermometer != null) {
            return _thermometer!!
        }
        _thermometer = Builder(name = "Thermometer", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 58.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, false, 26.0f, 26.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 212.0f, 58.0f)
                close()
                moveTo(212.0f, 98.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, 14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 212.0f, 98.0f)
                close()
                moveTo(126.0f, 154.6f)
                lineTo(126.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(66.6f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, 12.0f, 0.0f)
                close()
                moveTo(120.0f, 202.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 120.0f, 202.0f)
                close()
                moveTo(158.0f, 135.0f)
                lineTo(158.0f, 48.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, -76.0f, 0.0f)
                verticalLineToRelative(87.0f)
                arcToRelative(62.0f, 62.0f, 0.0f, true, false, 76.0f, 0.0f)
                close()
                moveTo(120.0f, 234.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, true, -28.57f, -91.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 94.0f, 138.0f)
                lineTo(94.0f, 48.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 52.0f, 0.0f)
                verticalLineToRelative(90.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.57f, 4.92f)
                arcTo(50.0f, 50.0f, 0.0f, false, true, 120.0f, 234.0f)
                close()
            }
        }
        .build()
        return _thermometer!!
    }

private var _thermometer: ImageVector? = null
