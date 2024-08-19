package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Escalatorup: ImageVector
    get() {
        if (_escalatorup != null) {
            return _escalatorup!!
        }
        _escalatorup = Builder(name = "Escalatorup", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 44.0f)
                lineTo(168.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.94f, 1.29f)
                lineTo(70.25f, 148.0f)
                lineTo(32.0f, 148.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(88.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.94f, -1.29f)
                lineTo(185.75f, 108.0f)
                lineTo(224.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(236.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 44.0f)
                close()
                moveTo(228.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(184.0f, 100.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.94f, 1.29f)
                lineTo(86.25f, 204.0f)
                lineTo(32.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(28.0f, 160.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(72.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.94f, -1.29f)
                lineTo(169.75f, 52.0f)
                lineTo(224.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(226.83f, 173.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 5.66f)
                lineTo(204.0f, 161.66f)
                lineTo(204.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(196.0f, 161.66f)
                lineToRelative(-17.17f, 17.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f)
                close()
            }
        }
        .build()
        return _escalatorup!!
    }

private var _escalatorup: ImageVector? = null
