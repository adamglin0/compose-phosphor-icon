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

public val LightGroup.ThermometerSimple: ImageVector
    get() {
        if (_thermometerSimple != null) {
            return _thermometerSimple!!
        }
        _thermometerSimple = Builder(name = "ThermometerSimple", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(134.0f, 154.6f)
                lineTo(134.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(66.6f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, 12.0f, 0.0f)
                close()
                moveTo(128.0f, 202.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 128.0f, 202.0f)
                close()
                moveTo(166.0f, 135.0f)
                lineTo(166.0f, 48.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, -76.0f, 0.0f)
                verticalLineToRelative(87.0f)
                arcToRelative(62.0f, 62.0f, 0.0f, true, false, 76.0f, 0.0f)
                close()
                moveTo(128.0f, 234.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, true, -28.57f, -91.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 102.0f, 138.0f)
                lineTo(102.0f, 48.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 52.0f, 0.0f)
                verticalLineToRelative(90.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.57f, 4.92f)
                arcTo(50.0f, 50.0f, 0.0f, false, true, 128.0f, 234.0f)
                close()
            }
        }
        .build()
        return _thermometerSimple!!
    }

private var _thermometerSimple: ImageVector? = null
