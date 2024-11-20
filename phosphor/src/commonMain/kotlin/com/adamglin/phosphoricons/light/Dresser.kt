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

public val LightGroup.Dresser: ImageVector
    get() {
        if (_dresser != null) {
            return _dresser!!
        }
        _dresser = Builder(name = "Dresser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(142.0f, 192.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(120.0f, 198.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(16.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 142.0f, 192.0f)
                close()
                moveTo(120.0f, 70.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(120.0f, 58.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                close()
                moveTo(136.0f, 122.0f)
                lineTo(120.0f, 122.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(214.0f, 40.0f)
                lineTo(214.0f, 216.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f)
                lineTo(56.0f, 230.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                lineTo(42.0f, 40.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 56.0f, 26.0f)
                lineTo(200.0f, 26.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 214.0f, 40.0f)
                close()
                moveTo(54.0f, 154.0f)
                lineTo(202.0f, 154.0f)
                lineTo(202.0f, 102.0f)
                lineTo(54.0f, 102.0f)
                close()
                moveTo(54.0f, 40.0f)
                lineTo(54.0f, 90.0f)
                lineTo(202.0f, 90.0f)
                lineTo(202.0f, 40.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(56.0f, 38.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 54.0f, 40.0f)
                close()
                moveTo(202.0f, 216.0f)
                lineTo(202.0f, 166.0f)
                lineTo(54.0f, 166.0f)
                verticalLineToRelative(50.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                lineTo(200.0f, 218.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 202.0f, 216.0f)
                close()
            }
        }
        .build()
        return _dresser!!
    }

private var _dresser: ImageVector? = null
