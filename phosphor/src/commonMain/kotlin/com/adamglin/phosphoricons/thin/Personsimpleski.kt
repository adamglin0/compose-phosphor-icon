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

public val ThinGroup.PersonSimpleSki: ImageVector
    get() {
        if (_personSimpleSki != null) {
            return _personSimpleSki!!
        }
        _personSimpleSki = Builder(name = "PersonSimpleSki", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 84.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 172.0f, 84.0f)
                close()
                moveTo(172.0f, 44.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 172.0f, 44.0f)
                close()
                moveTo(38.88f, 83.84f)
                lineToRelative(112.0f, 32.65f)
                lineToRelative(6.33f, 6.33f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 160.0f, 124.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(161.66f, 116.0f)
                lineTo(130.83f, 85.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 0.0f)
                lineToRelative(-12.0f, 12.0f)
                lineToRelative(-72.05f, -21.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.24f, 7.68f)
                close()
                moveTo(128.0f, 93.65f)
                lineToRelative(11.07f, 11.08f)
                lineToRelative(-17.14f, -5.0f)
                close()
                moveTo(234.22f, 200.92f)
                arcToRelative(65.8f, 65.8f, 0.0f, false, true, -55.0f, 8.43f)
                lineTo(22.88f, 163.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 2.24f, -7.68f)
                lineToRelative(78.27f, 22.79f)
                lineToRelative(33.0f, -33.0f)
                lineTo(86.9f, 131.84f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 2.2f, -7.69f)
                lineToRelative(56.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.73f, 6.67f)
                lineTo(112.15f, 181.5f)
                lineToRelative(69.28f, 20.17f)
                arcToRelative(57.81f, 57.81f, 0.0f, false, false, 48.35f, -7.41f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.44f, 6.66f)
                close()
            }
        }
        .build()
        return _personSimpleSki!!
    }

private var _personSimpleSki: ImageVector? = null
