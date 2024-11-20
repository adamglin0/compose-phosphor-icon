package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Lectern: ImageVector
    get() {
        if (_lectern != null) {
            return _lectern!!
        }
        _lectern = Builder(name = "Lectern", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(242.72f, 122.63f)
                lineToRelative(-40.0f, -80.0f)
                arcTo(11.93f, 11.93f, 0.0f, false, false, 192.0f, 36.0f)
                lineTo(64.0f, 36.0f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, -10.73f, 6.63f)
                lineToRelative(-40.0f, 80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 24.0f, 140.0f)
                lineTo(124.0f, 140.0f)
                verticalLineToRelative(72.0f)
                lineTo(96.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(132.0f, 212.0f)
                lineTo(132.0f, 140.0f)
                lineTo(232.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.73f, -17.37f)
                close()
                moveTo(235.39f, 130.1f)
                arcTo(3.94f, 3.94f, 0.0f, false, true, 232.0f, 132.0f)
                lineTo(24.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.58f, -5.79f)
                lineToRelative(40.0f, -80.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 64.0f, 44.0f)
                lineTo(192.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.58f, 2.21f)
                lineToRelative(40.0f, 80.0f)
                arcTo(3.94f, 3.94f, 0.0f, false, true, 235.39f, 130.1f)
                close()
                moveTo(188.0f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(72.0f, 108.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(184.0f, 100.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 188.0f, 104.0f)
                close()
            }
        }
        .build()
        return _lectern!!
    }

private var _lectern: ImageVector? = null
