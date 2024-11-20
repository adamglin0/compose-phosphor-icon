package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.NavigationArrow: ImageVector
    get() {
        if (_navigationArrow != null) {
            return _navigationArrow!!
        }
        _navigationArrow = Builder(name = "NavigationArrow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(234.35f, 129.0f)
                lineTo(152.0f, 152.0f)
                lineTo(129.0f, 234.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -15.21f, 0.27f)
                lineToRelative(-65.28f, -176.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 58.63f, 48.46f)
                lineToRelative(176.0f, 65.28f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 234.35f, 129.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.33f, 106.21f)
                lineTo(61.41f, 41.0f)
                lineToRelative(-0.16f, -0.05f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.9f, 61.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.05f, 0.16f)
                lineToRelative(65.26f, 175.92f)
                arcTo(15.77f, 15.77f, 0.0f, false, false, 121.28f, 248.0f)
                horizontalLineToRelative(0.3f)
                arcToRelative(15.77f, 15.77f, 0.0f, false, false, 15.0f, -11.29f)
                lineToRelative(0.06f, -0.2f)
                lineToRelative(21.84f, -78.0f)
                lineToRelative(78.0f, -21.84f)
                lineToRelative(0.2f, -0.06f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.62f, -30.38f)
                close()
                moveTo(149.84f, 144.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.54f, 5.54f)
                lineTo(121.3f, 232.0f)
                lineToRelative(-0.06f, -0.17f)
                lineTo(56.0f, 56.0f)
                lineToRelative(175.82f, 65.22f)
                lineToRelative(0.16f, 0.06f)
                close()
            }
        }
        .build()
        return _navigationArrow!!
    }

private var _navigationArrow: ImageVector? = null
