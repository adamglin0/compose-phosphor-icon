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

public val LightGroup.MoonStars: ImageVector
    get() {
        if (_moonStars != null) {
            return _moonStars!!
        }
        _moonStars = Builder(name = "MoonStars", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(214.0f, 102.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(202.0f, 102.0f)
                lineTo(184.0f, 102.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(18.0f)
                lineTo(202.0f, 72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                lineTo(214.0f, 90.0f)
                horizontalLineToRelative(18.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 238.0f, 96.0f)
                close()
                moveTo(144.0f, 54.0f)
                horizontalLineToRelative(10.0f)
                lineTo(154.0f, 64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(166.0f, 54.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(166.0f, 42.0f)
                lineTo(166.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(154.0f, 42.0f)
                lineTo(144.0f, 42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                close()
                moveTo(215.25f, 154.28f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 1.07f, 6.0f)
                arcTo(94.0f, 94.0f, 0.0f, true, true, 95.76f, 39.68f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 7.94f, 6.79f)
                arcTo(90.11f, 90.11f, 0.0f, false, false, 192.0f, 154.0f)
                arcToRelative(90.9f, 90.9f, 0.0f, false, false, 17.53f, -1.7f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 215.25f, 154.28f)
                close()
                moveTo(200.88f, 165.62f)
                quadToRelative(-4.42f, 0.38f, -8.88f, 0.38f)
                arcTo(102.12f, 102.12f, 0.0f, false, true, 90.0f, 64.0f)
                quadToRelative(0.0f, -4.45f, 0.38f, -8.88f)
                arcToRelative(82.0f, 82.0f, 0.0f, true, false, 110.5f, 110.5f)
                close()
            }
        }
        .build()
        return _moonStars!!
    }

private var _moonStars: ImageVector? = null
