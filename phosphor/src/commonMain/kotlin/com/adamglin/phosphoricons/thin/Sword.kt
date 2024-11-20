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

public val ThinGroup.Sword: ImageVector
    get() {
        if (_sword != null) {
            return _sword!!
        }
        _sword = Builder(name = "Sword", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 36.0f)
                lineTo(152.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.17f, 1.56f)
                lineTo(82.05f, 124.38f)
                lineTo(69.19f, 111.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineTo(39.52f, 124.21f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                lineTo(62.34f, 164.0f)
                lineTo(31.52f, 194.83f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                lineTo(44.2f, 224.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 0.0f)
                lineTo(92.0f, 193.67f)
                lineToRelative(22.81f, 22.82f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 0.0f)
                lineToRelative(12.69f, -12.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -17.0f)
                lineTo(131.62f, 174.0f)
                lineToRelative(86.82f, -66.79f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 220.0f, 104.0f)
                lineTo(220.0f, 40.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 216.0f, 36.0f)
                close()
                moveTo(55.52f, 218.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f)
                lineTo(37.17f, 206.15f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.66f)
                lineTo(68.0f, 169.67f)
                lineTo(86.34f, 188.0f)
                close()
                moveTo(138.83f, 192.47f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.67f)
                lineToRelative(-12.7f, 12.69f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f)
                lineToRelative(-75.3f, -75.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.66f)
                lineToRelative(12.7f, -12.69f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f)
                close()
                moveTo(212.0f, 102.0f)
                lineToRelative(-86.08f, 66.22f)
                lineTo(109.66f, 152.0f)
                lineToRelative(53.17f, -53.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.66f, -5.66f)
                lineTo(104.0f, 146.34f)
                lineTo(87.75f, 130.08f)
                lineTo(154.0f, 44.0f)
                horizontalLineToRelative(58.0f)
                close()
            }
        }
        .build()
        return _sword!!
    }

private var _sword: ImageVector? = null
