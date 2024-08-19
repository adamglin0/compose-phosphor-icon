package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Bulldozer: ImageVector
    get() {
        if (_bulldozer != null) {
            return _bulldozer!!
        }
        _bulldozer = Builder(name = "Bulldozer", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 196.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineTo(160.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -28.0f, 28.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-9.68f)
                arcToRelative(44.13f, 44.13f, 0.0f, false, false, -34.0f, -31.2f)
                lineToRelative(-35.2f, -84.49f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 110.67f, 36.0f)
                horizontalLineTo(24.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 4.0f, 56.0f)
                verticalLineTo(157.7f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 44.0f, 220.0f)
                horizontalLineTo(156.0f)
                arcToRelative(44.06f, 44.06f, 0.0f, false, false, 42.32f, -32.0f)
                horizontalLineTo(208.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, 28.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(138.0f, 132.0f)
                horizontalLineTo(68.0f)
                verticalLineTo(60.0f)
                horizontalLineToRelative(40.0f)
                close()
                moveTo(44.0f, 60.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(43.85f, 43.85f, 0.0f, false, false, -16.0f, 3.0f)
                verticalLineTo(60.0f)
                close()
                moveTo(156.0f, 196.0f)
                horizontalLineTo(44.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 0.0f, -40.0f)
                horizontalLineTo(156.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 0.0f, 40.0f)
                close()
            }
        }
        .build()
        return _bulldozer!!
    }

private var _bulldozer: ImageVector? = null
