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

public val BoldGroup.CarProfile: ImageVector
    get() {
        if (_carProfile != null) {
            return _carProfile!!
        }
        _carProfile = Builder(name = "CarProfile", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 108.0f)
                lineTo(213.0f, 108.0f)
                lineTo(170.83f, 65.86f)
                arcTo(19.86f, 19.86f, 0.0f, false, false, 156.69f, 60.0f)
                lineTo(48.28f, 60.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -16.64f, 8.91f)
                lineTo(2.0f, 113.34f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.0f, 120.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(33.5f, 188.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, 65.0f, 0.0f)
                horizontalLineToRelative(59.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, 65.0f, 0.0f)
                lineTo(236.0f, 188.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(256.0f, 128.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 236.0f, 108.0f)
                close()
                moveTo(50.42f, 84.0f)
                lineTo(155.0f, 84.0f)
                lineToRelative(24.0f, 24.0f)
                lineTo(34.42f, 108.0f)
                close()
                moveTo(66.0f, 188.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 66.0f, 188.0f)
                close()
                moveTo(190.0f, 188.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 190.0f, 188.0f)
                close()
                moveTo(232.0f, 164.0f)
                lineTo(221.0f, 164.0f)
                arcTo(34.0f, 34.0f, 0.0f, false, false, 159.0f, 164.0f)
                lineTo(97.0f, 164.0f)
                arcTo(34.0f, 34.0f, 0.0f, false, false, 35.0f, 164.0f)
                lineTo(24.0f, 164.0f)
                lineTo(24.0f, 132.0f)
                lineTo(232.0f, 132.0f)
                close()
            }
        }
        .build()
        return _carProfile!!
    }

private var _carProfile: ImageVector? = null
