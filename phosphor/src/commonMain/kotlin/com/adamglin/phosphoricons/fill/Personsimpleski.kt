package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.PersonSimpleSki: ImageVector
    get() {
        if (_personSimpleSki != null) {
            return _personSimpleSki!!
        }
        _personSimpleSki = Builder(name = "PersonSimpleSki", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 60.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, 28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 144.0f, 60.0f)
                close()
                moveTo(37.76f, 87.68f)
                lineToRelative(111.0f, 32.36f)
                lineToRelative(5.61f, 5.61f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 160.0f, 128.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(163.31f, 112.0f)
                lineToRelative(-4.72f, -4.72f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(-24.9f, -24.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 0.0f)
                lineTo(112.0f, 92.67f)
                lineTo(42.24f, 72.32f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.48f, 15.36f)
                close()
                moveTo(238.66f, 193.15f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.1f, -2.22f)
                arcToRelative(53.78f, 53.78f, 0.0f, false, true, -45.0f, 6.9f)
                lineToRelative(-62.79f, -18.28f)
                lineToRelative(29.9f, -29.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.46f, -13.35f)
                lineToRelative(-56.0f, -16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.4f, 15.39f)
                lineTo(128.73f, 148.0f)
                lineToRelative(-26.5f, 26.49f)
                lineToRelative(-76.0f, -22.13f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -4.48f, 15.36f)
                lineToRelative(156.31f, 45.52f)
                arcToRelative(69.78f, 69.78f, 0.0f, false, false, 58.37f, -8.95f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 238.66f, 193.15f)
                close()
            }
        }
        .build()
        return _personSimpleSki!!
    }

private var _personSimpleSki: ImageVector? = null
