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

public val DuotoneGroup.Filmslate: ImageVector
    get() {
        if (_filmslate != null) {
            return _filmslate!!
        }
        _filmslate = Builder(name = "Filmslate", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(67.71f, 64.59f)
                lineToRelative(47.79f, 27.6f)
                lineTo(40.43f, 112.0f)
                lineTo(32.27f, 82.0f)
                arcToRelative(7.76f, 7.76f, 0.0f, false, true, 5.58f, -9.52f)
                close()
                moveTo(199.84f, 37.76f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -9.66f, -5.49f)
                lineTo(126.61f, 49.05f)
                lineTo(174.4f, 76.64f)
                lineTo(208.0f, 67.77f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 104.0f)
                lineTo(102.09f, 104.0f)
                lineTo(210.0f, 75.51f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.68f, -9.84f)
                lineToRelative(-8.16f, -30.0f)
                arcToRelative(15.93f, 15.93f, 0.0f, false, false, -19.42f, -11.13f)
                lineTo(35.81f, 64.74f)
                arcToRelative(15.75f, 15.75f, 0.0f, false, false, -9.7f, 7.4f)
                arcToRelative(15.51f, 15.51f, 0.0f, false, false, -1.55f, 12.0f)
                lineTo(32.0f, 111.56f)
                curveToRelative(0.0f, 0.14f, 0.0f, 0.29f, 0.0f, 0.44f)
                verticalLineToRelative(88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(208.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 112.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 104.0f)
                close()
                moveTo(192.16f, 40.0f)
                lineToRelative(6.0f, 22.07f)
                lineToRelative(-22.62f, 6.0f)
                lineTo(147.42f, 51.83f)
                close()
                moveTo(125.47f, 57.6f)
                lineTo(153.59f, 73.84f)
                lineTo(116.65f, 83.59f)
                lineTo(88.53f, 67.37f)
                close()
                moveTo(46.07f, 102.22f)
                lineTo(40.07f, 80.14f)
                lineTo(66.57f, 73.14f)
                lineTo(94.69f, 89.4f)
                close()
                moveTo(208.0f, 200.0f)
                lineTo(48.0f, 200.0f)
                lineTo(48.0f, 120.0f)
                lineTo(208.0f, 120.0f)
                verticalLineToRelative(80.0f)
                close()
            }
        }
        .build()
        return _filmslate!!
    }

private var _filmslate: ImageVector? = null
