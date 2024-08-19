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

public val LightGroup.City: ImageVector
    get() {
        if (_city != null) {
            return _city!!
        }
        _city = Builder(name = "City", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 210.0f)
                lineTo(230.0f, 210.0f)
                lineTo(230.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                lineTo(160.0f, 82.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(42.0f)
                lineTo(102.0f, 130.0f)
                lineTo(102.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                lineTo(32.0f, 34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(26.0f, 210.0f)
                lineTo(16.0f, 210.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(240.0f, 222.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(166.0f, 94.0f)
                horizontalLineToRelative(52.0f)
                lineTo(218.0f, 210.0f)
                lineTo(166.0f, 210.0f)
                close()
                moveTo(154.0f, 142.0f)
                verticalLineToRelative(68.0f)
                lineTo(102.0f, 210.0f)
                lineTo(102.0f, 142.0f)
                close()
                moveTo(38.0f, 46.0f)
                lineTo(90.0f, 46.0f)
                lineTo(90.0f, 210.0f)
                lineTo(38.0f, 210.0f)
                close()
                moveTo(70.0f, 72.0f)
                lineTo(70.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(58.0f, 72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(70.0f, 120.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(58.0f, 120.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(70.0f, 168.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(58.0f, 168.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(122.0f, 184.0f)
                lineTo(122.0f, 168.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                close()
                moveTo(186.0f, 184.0f)
                lineTo(186.0f, 168.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                close()
                moveTo(186.0f, 136.0f)
                lineTo(186.0f, 120.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _city!!
    }

private var _city: ImageVector? = null
