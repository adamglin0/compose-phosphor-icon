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

public val LightGroup.PersonSimpleSki: ImageVector
    get() {
        if (_personSimpleSki != null) {
            return _personSimpleSki!!
        }
        _personSimpleSki = Builder(name = "PersonSimpleSki", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 86.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, false, -26.0f, -26.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 172.0f, 86.0f)
                close()
                moveTo(172.0f, 46.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, -14.0f, 14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 172.0f, 46.0f)
                close()
                moveTo(38.32f, 85.76f)
                lineToRelative(111.47f, 32.51f)
                lineToRelative(6.0f, 6.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 160.0f, 126.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(162.49f, 114.0f)
                lineTo(132.24f, 83.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 0.0f)
                lineTo(112.59f, 94.92f)
                lineTo(41.68f, 74.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -3.36f, 11.52f)
                close()
                moveTo(128.0f, 96.48f)
                lineToRelative(4.14f, 4.14f)
                lineToRelative(-6.41f, -1.87f)
                close()
                moveTo(235.33f, 202.58f)
                arcToRelative(67.79f, 67.79f, 0.0f, false, true, -56.7f, 8.69f)
                lineTo(22.32f, 165.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 3.36f, -11.52f)
                lineToRelative(77.13f, 22.46f)
                lineTo(132.55f, 147.0f)
                lineToRelative(-46.2f, -13.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 3.3f, -11.54f)
                lineToRelative(56.0f, 16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.59f, 10.0f)
                lineTo(116.0f, 180.52f)
                lineToRelative(66.0f, 19.23f)
                arcToRelative(55.79f, 55.79f, 0.0f, false, false, 46.68f, -7.15f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 6.66f, 10.0f)
                close()
            }
        }
        .build()
        return _personSimpleSki!!
    }

private var _personSimpleSki: ImageVector? = null
