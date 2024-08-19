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

public val DuotoneGroup.Chartpieslice: ImageVector
    get() {
        if (_chartpieslice != null) {
            return _chartpieslice!!
        }
        _chartpieslice = Builder(name = "Chartpieslice", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(96.0f, 37.5f)
                verticalLineToRelative(72.0f)
                lineToRelative(-62.4f, 36.0f)
                arcTo(96.0f, 96.0f, 0.0f, false, true, 96.0f, 37.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(100.0f, 116.43f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.0f, -6.93f)
                verticalLineToRelative(-72.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 93.34f, 30.0f)
                arcTo(104.06f, 104.06f, 0.0f, false, false, 25.73f, 147.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.52f, 5.81f)
                arcToRelative(7.86f, 7.86f, 0.0f, false, false, 3.35f, 0.74f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.0f, -1.07f)
                close()
                moveTo(88.0f, 49.62f)
                verticalLineToRelative(55.26f)
                lineTo(40.12f, 132.51f)
                curveTo(40.0f, 131.0f, 40.0f, 129.48f, 40.0f, 128.0f)
                arcTo(88.12f, 88.12f, 0.0f, false, true, 88.0f, 49.62f)
                close()
                moveTo(128.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(91.82f)
                lineTo(41.19f, 169.73f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.87f, 11.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 128.0f, 24.0f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(88.47f, 88.47f, 0.0f, false, true, -71.49f, -36.68f)
                lineToRelative(75.52f, -44.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.0f, -6.92f)
                lineTo(136.03f, 40.36f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 128.0f, 216.0f)
                close()
            }
        }
        .build()
        return _chartpieslice!!
    }

private var _chartpieslice: ImageVector? = null
