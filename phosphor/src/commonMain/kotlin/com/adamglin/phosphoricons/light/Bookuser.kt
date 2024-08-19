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

public val LightGroup.Bookuser: ImageVector
    get() {
        if (_bookuser != null) {
            return _bookuser!!
        }
        _bookuser = Builder(name = "Bookuser", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 74.0f)
                lineTo(160.0f, 74.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, -32.0f, 17.55f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 96.0f, 74.0f)
                lineTo(24.0f, 74.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(18.0f, 200.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                lineTo(96.0f, 206.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 26.0f, 26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 26.0f, -26.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(238.0f, 80.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 232.0f, 74.0f)
                close()
                moveTo(96.0f, 194.0f)
                lineTo(30.0f, 194.0f)
                lineTo(30.0f, 86.0f)
                lineTo(96.0f, 86.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 26.0f, 26.0f)
                verticalLineToRelative(92.31f)
                arcTo(37.86f, 37.86f, 0.0f, false, false, 96.0f, 194.0f)
                close()
                moveTo(226.0f, 194.0f)
                lineTo(160.0f, 194.0f)
                arcToRelative(37.83f, 37.83f, 0.0f, false, false, -26.0f, 10.33f)
                lineTo(134.0f, 112.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 26.0f, -26.0f)
                horizontalLineToRelative(66.0f)
                close()
                moveTo(91.2f, 44.4f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, true, 73.6f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -9.6f, 7.2f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, -54.4f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -9.6f, -7.2f)
                close()
            }
        }
        .build()
        return _bookuser!!
    }

private var _bookuser: ImageVector? = null
