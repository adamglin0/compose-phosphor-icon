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

public val LightGroup.EscalatorDown: ImageVector
    get() {
        if (_escalatorDown != null) {
            return _escalatorDown!!
        }
        _escalatorDown = Builder(name = "EscalatorDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(171.76f, 84.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f)
                lineTo(194.0f, 89.51f)
                lineTo(194.0f, 48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                lineTo(206.0f, 89.51f)
                lineToRelative(13.76f, -13.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 8.48f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, 0.0f)
                close()
                moveTo(238.0f, 160.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f)
                lineTo(168.0f, 214.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.41f, -1.93f)
                lineTo(69.37f, 110.0f)
                lineTo(32.0f, 110.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 18.0f, 96.0f)
                lineTo(18.0f, 56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 32.0f, 42.0f)
                lineTo(88.0f, 42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.41f, 1.93f)
                lineTo(186.63f, 146.0f)
                lineTo(224.0f, 146.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 238.0f, 160.0f)
                close()
                moveTo(226.0f, 160.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(184.0f, 158.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.41f, -1.93f)
                lineTo(85.37f, 54.0f)
                lineTo(32.0f, 54.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                lineTo(30.0f, 96.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                lineTo(72.0f, 98.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.41f, 1.93f)
                lineTo(170.63f, 202.0f)
                lineTo(224.0f, 202.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _escalatorDown!!
    }

private var _escalatorDown: ImageVector? = null
