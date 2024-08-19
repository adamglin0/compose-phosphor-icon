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

public val DuotoneGroup.Musicnotesplus: ImageVector
    get() {
        if (_musicnotesplus != null) {
            return _musicnotesplus!!
        }
        _musicnotesplus = Builder(name = "Musicnotesplus", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 164.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, -28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 208.0f, 164.0f)
                close()
                moveTo(52.0f, 168.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 28.0f, 28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 52.0f, 168.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(208.0f, 56.0f)
                lineTo(208.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(192.0f, 56.0f)
                lineTo(176.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(16.0f)
                lineTo(192.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                lineTo(208.0f, 40.0f)
                horizontalLineToRelative(16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 48.0f)
                close()
                moveTo(216.0f, 112.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, -16.0f, -29.92f)
                lineTo(200.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(200.0f, 164.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, false, -20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 200.0f, 164.0f)
                close()
                moveTo(88.0f, 110.25f)
                lineTo(88.0f, 196.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, -16.0f, -29.92f)
                lineTo(72.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.06f, -7.76f)
                lineToRelative(56.0f, -14.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.88f, 15.52f)
                lineTo(88.0f, 62.25f)
                verticalLineToRelative(31.5f)
                lineToRelative(70.06f, -17.51f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.88f, 15.52f)
                close()
                moveTo(72.0f, 196.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, false, -20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 72.0f, 196.0f)
                close()
            }
        }
        .build()
        return _musicnotesplus!!
    }

private var _musicnotesplus: ImageVector? = null
