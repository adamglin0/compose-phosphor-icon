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

public val LightGroup.Filevue: ImageVector
    get() {
        if (_filevue != null) {
            return _filevue!!
        }
        _filevue = Builder(name = "Filevue", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(85.65f, 154.0f)
                lineToRelative(-20.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -11.3f, 0.0f)
                lineToRelative(-20.0f, -56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.3f, -4.0f)
                lineTo(60.0f, 190.16f)
                lineTo(74.35f, 150.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.3f, 4.0f)
                close()
                moveTo(208.0f, 158.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(176.0f, 146.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(182.0f, 202.0f)
                lineTo(182.0f, 186.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(182.0f, 174.0f)
                lineTo(182.0f, 158.0f)
                close()
                moveTo(144.0f, 146.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(38.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(114.0f, 152.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(38.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 48.0f, 0.0f)
                lineTo(150.0f, 152.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 144.0f, 146.0f)
                close()
                moveTo(214.0f, 88.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(202.0f, 94.0f)
                lineTo(152.0f, 94.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, -6.0f)
                lineTo(146.0f, 38.0f)
                lineTo(56.0f, 38.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(42.0f, 40.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 56.0f, 26.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.25f, 1.76f)
                lineToRelative(56.0f, 56.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 214.0f, 88.0f)
                close()
                moveTo(193.52f, 82.0f)
                lineTo(158.0f, 46.48f)
                lineTo(158.0f, 82.0f)
                close()
            }
        }
        .build()
        return _filevue!!
    }

private var _filevue: ImageVector? = null
