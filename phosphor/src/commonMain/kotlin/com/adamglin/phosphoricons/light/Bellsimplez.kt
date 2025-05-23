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

public val LightGroup.BellSimpleZ: ImageVector
    get() {
        if (_bellSimpleZ != null) {
            return _bellSimpleZ!!
        }
        _bellSimpleZ = Builder(name = "BellSimpleZ", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(166.0f, 224.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(96.0f, 230.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(64.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 166.0f, 224.0f)
                close()
                moveTo(144.0f, 138.0f)
                lineTo(123.21f, 138.0f)
                lineTo(149.0f, 99.33f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 144.0f, 90.0f)
                lineTo(112.0f, 90.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(20.79f)
                lineTo(107.0f, 140.67f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.0f, 9.33f)
                horizontalLineToRelative(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(220.11f, 191.0f)
                arcToRelative(13.83f, 13.83f, 0.0f, false, true, -12.1f, 7.0f)
                lineTo(48.0f, 198.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -12.06f, -21.06f)
                curveTo(41.59f, 167.2f, 50.0f, 139.74f, 50.0f, 104.0f)
                arcToRelative(78.0f, 78.0f, 0.0f, true, true, 156.0f, 0.0f)
                curveToRelative(0.0f, 35.73f, 8.42f, 63.2f, 14.08f, 72.94f)
                arcTo(13.9f, 13.9f, 0.0f, false, true, 220.11f, 191.0f)
                close()
                moveTo(209.7f, 183.0f)
                curveTo(202.13f, 170.0f, 194.0f, 139.68f, 194.0f, 104.0f)
                arcToRelative(66.0f, 66.0f, 0.0f, true, false, -132.0f, 0.0f)
                curveToRelative(0.0f, 35.69f, -8.14f, 66.0f, -15.71f, 79.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, 1.7f, 1.0f)
                lineTo(208.0f, 186.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, 1.7f, -1.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 209.7f, 183.0f)
                close()
            }
        }
        .build()
        return _bellSimpleZ!!
    }

private var _bellSimpleZ: ImageVector? = null
