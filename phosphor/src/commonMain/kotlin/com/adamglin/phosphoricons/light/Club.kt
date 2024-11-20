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

public val LightGroup.Club: ImageVector
    get() {
        if (_club != null) {
            return _club!!
        }
        _club = Builder(name = "Club", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 90.0f)
                quadToRelative(-2.59f, 0.0f, -5.16f, 0.24f)
                arcToRelative(54.0f, 54.0f, 0.0f, true, false, -101.69f, 0.0f)
                curveTo(75.45f, 90.08f, 73.73f, 90.0f, 72.0f, 90.0f)
                arcTo(54.0f, 54.0f, 0.0f, true, false, 99.85f, 190.28f)
                lineToRelative(-9.6f, 32.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 96.0f, 230.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.75f, -7.72f)
                lineToRelative(-9.6f, -32.0f)
                arcTo(54.0f, 54.0f, 0.0f, true, false, 184.0f, 90.0f)
                close()
                moveTo(184.0f, 186.0f)
                arcToRelative(41.92f, 41.92f, 0.0f, false, true, -35.06f, -18.87f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.76f, 5.0f)
                lineTo(151.94f, 218.0f)
                lineTo(104.06f, 218.0f)
                lineToRelative(13.76f, -45.84f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.76f, -5.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, true, true, -20.91f, -62.69f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 7.0f, -9.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, true, true, 69.72f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 7.0f, 9.0f)
                arcTo(42.0f, 42.0f, 0.0f, true, true, 184.0f, 186.0f)
                close()
            }
        }
        .build()
        return _club!!
    }

private var _club: ImageVector? = null
