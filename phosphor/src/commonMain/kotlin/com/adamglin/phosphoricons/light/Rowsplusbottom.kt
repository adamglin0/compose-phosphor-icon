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

public val LightGroup.Rowsplusbottom: ImageVector
    get() {
        if (_rowsplusbottom != null) {
            return _rowsplusbottom!!
        }
        _rowsplusbottom = Builder(name = "Rowsplusbottom", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 114.0f)
                lineTo(48.0f, 114.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, 14.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(208.0f, 166.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(222.0f, 128.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 208.0f, 114.0f)
                close()
                moveTo(210.0f, 152.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(48.0f, 154.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(46.0f, 128.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(208.0f, 126.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(208.0f, 42.0f)
                lineTo(48.0f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 56.0f)
                lineTo(34.0f, 80.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 48.0f, 94.0f)
                lineTo(208.0f, 94.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(222.0f, 56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 208.0f, 42.0f)
                close()
                moveTo(210.0f, 80.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(48.0f, 82.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(46.0f, 56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(208.0f, 54.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(158.0f, 216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(134.0f, 222.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(122.0f, 222.0f)
                lineTo(104.0f, 222.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(18.0f)
                lineTo(122.0f, 192.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(18.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 158.0f, 216.0f)
                close()
            }
        }
        .build()
        return _rowsplusbottom!!
    }

private var _rowsplusbottom: ImageVector? = null
