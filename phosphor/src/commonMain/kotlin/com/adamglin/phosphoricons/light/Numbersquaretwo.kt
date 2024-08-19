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

public val LightGroup.Numbersquaretwo: ImageVector
    get() {
        if (_numbersquaretwo != null) {
            return _numbersquaretwo!!
        }
        _numbersquaretwo = Builder(name = "Numbersquaretwo", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 34.0f)
                lineTo(48.0f, 34.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 48.0f)
                lineTo(34.0f, 208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(208.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(222.0f, 48.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 208.0f, 34.0f)
                close()
                moveTo(210.0f, 208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(48.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(46.0f, 48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(208.0f, 46.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(158.0f, 176.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(104.0f, 182.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.8f, -9.6f)
                lineToRelative(43.17f, -57.56f)
                arcTo(18.0f, 18.0f, 0.0f, true, false, 111.0f, 98.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -11.31f, -4.0f)
                arcTo(30.0f, 30.0f, 0.0f, true, true, 152.0f, 122.06f)
                lineTo(116.0f, 170.0f)
                horizontalLineToRelative(36.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 158.0f, 176.0f)
                close()
            }
        }
        .build()
        return _numbersquaretwo!!
    }

private var _numbersquaretwo: ImageVector? = null
