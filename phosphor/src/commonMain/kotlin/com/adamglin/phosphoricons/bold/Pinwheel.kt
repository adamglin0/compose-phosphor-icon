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

public val BoldGroup.Pinwheel: ImageVector
    get() {
        if (_pinwheel != null) {
            return _pinwheel!!
        }
        _pinwheel = Builder(name = "Pinwheel", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.49f, 215.52f)
                lineToRelative(-44.0f, -44.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 35.59f, -81.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -15.38f, -7.17f)
                lineToRelative(-35.61f, 13.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 90.59f, 15.89f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.17f, 15.38f)
                lineToRelative(13.0f, 35.61f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, -80.49f, 82.55f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 15.38f, 7.17f)
                lineToRelative(35.61f, -13.0f)
                arcToRelative(63.94f, 63.94f, 0.0f, false, false, 82.55f, 80.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 7.17f, -15.38f)
                lineToRelative(-12.95f, -35.59f)
                arcToRelative(63.53f, 63.53f, 0.0f, false, false, 15.7f, 3.16f)
                lineToRelative(56.17f, 56.17f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, -17.0f)
                close()
                moveTo(129.38f, 39.78f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 7.43f, 68.0f)
                lineTo(110.7f, 36.05f)
                arcTo(39.81f, 39.81f, 0.0f, false, true, 129.38f, 39.78f)
                close()
                moveTo(36.05f, 129.32f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 71.75f, -26.11f)
                close()
                moveTo(110.64f, 200.24f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -7.43f, -68.0f)
                lineTo(129.32f, 204.0f)
                arcTo(39.83f, 39.83f, 0.0f, false, true, 110.64f, 200.24f)
                close()
                moveTo(147.09f, 148.73f)
                arcToRelative(39.86f, 39.86f, 0.0f, false, true, -14.87f, -11.92f)
                lineTo(204.0f, 110.7f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -56.88f, 38.0f)
                close()
            }
        }
        .build()
        return _pinwheel!!
    }

private var _pinwheel: ImageVector? = null
