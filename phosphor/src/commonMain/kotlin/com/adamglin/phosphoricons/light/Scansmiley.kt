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

public val LightGroup.ScanSmiley: ImageVector
    get() {
        if (_scanSmiley != null) {
            return _scanSmiley!!
        }
        _scanSmiley = Builder(name = "ScanSmiley", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.0f, 40.0f)
                lineTo(222.0f, 76.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(210.0f, 46.0f)
                lineTo(180.0f, 46.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(36.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 222.0f, 40.0f)
                close()
                moveTo(216.0f, 174.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(30.0f)
                lineTo(180.0f, 210.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(222.0f, 180.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 216.0f, 174.0f)
                close()
                moveTo(76.0f, 210.0f)
                lineTo(46.0f, 210.0f)
                lineTo(46.0f, 180.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                lineTo(76.0f, 222.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(40.0f, 82.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(46.0f, 46.0f)
                lineTo(76.0f, 46.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(40.0f, 34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(34.0f, 76.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 40.0f, 82.0f)
                close()
                moveTo(128.0f, 198.0f)
                arcToRelative(70.0f, 70.0f, 0.0f, true, true, 70.0f, -70.0f)
                arcTo(70.08f, 70.08f, 0.0f, false, true, 128.0f, 198.0f)
                close()
                moveTo(186.0f, 128.0f)
                arcToRelative(58.0f, 58.0f, 0.0f, true, false, -58.0f, 58.0f)
                arcTo(58.07f, 58.07f, 0.0f, false, false, 186.0f, 128.0f)
                close()
                moveTo(114.0f, 116.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 114.0f, 116.0f)
                close()
                moveTo(152.0f, 106.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 152.0f, 106.0f)
                close()
                moveTo(148.0f, 147.5f)
                curveToRelative(-4.2f, 3.71f, -12.81f, 6.5f, -20.0f, 6.5f)
                reflectiveCurveToRelative(-15.83f, -2.79f, -20.0f, -6.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.94f, 9.0f)
                curveToRelative(7.44f, 6.56f, 19.41f, 9.5f, 28.0f, 9.5f)
                reflectiveCurveToRelative(20.53f, -2.94f, 28.0f, -9.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -7.94f, -9.0f)
                close()
            }
        }
        .build()
        return _scanSmiley!!
    }

private var _scanSmiley: ImageVector? = null
