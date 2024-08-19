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

public val LightGroup.Popsicle: ImageVector
    get() {
        if (_popsicle != null) {
            return _popsicle!!
        }
        _popsicle = Builder(name = "Popsicle", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 10.0f)
                arcTo(70.08f, 70.08f, 0.0f, false, false, 58.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineToRelative(34.0f)
                verticalLineToRelative(42.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 44.0f, 0.0f)
                lineTo(150.0f, 190.0f)
                horizontalLineToRelative(34.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(198.0f, 80.0f)
                arcTo(70.08f, 70.08f, 0.0f, false, false, 128.0f, 10.0f)
                close()
                moveTo(138.0f, 232.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -20.0f, 0.0f)
                lineTo(118.0f, 190.0f)
                horizontalLineToRelative(20.0f)
                close()
                moveTo(186.0f, 176.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(72.0f, 178.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(70.0f, 80.0f)
                arcToRelative(58.0f, 58.0f, 0.0f, false, true, 116.0f, 0.0f)
                close()
                moveTo(118.0f, 72.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(106.0f, 72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(150.0f, 72.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(138.0f, 72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _popsicle!!
    }

private var _popsicle: ImageVector? = null
