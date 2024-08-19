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

public val BoldGroup.Usercheck: ImageVector
    get() {
        if (_usercheck != null) {
            return _usercheck!!
        }
        _usercheck = Builder(name = "Usercheck", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.5f, 156.54f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, false, -89.0f, 0.0f)
                arcToRelative(124.0f, 124.0f, 0.0f, false, false, -48.69f, 35.74f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 18.38f, 15.44f)
                curveTo(46.88f, 191.42f, 71.0f, 172.0f, 108.0f, 172.0f)
                reflectiveCurveToRelative(61.12f, 19.42f, 74.81f, 35.72f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 18.38f, -15.44f)
                arcTo(123.89f, 123.89f, 0.0f, false, false, 152.5f, 156.54f)
                close()
                moveTo(60.0f, 100.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 48.0f, 48.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, true, 60.0f, 100.0f)
                close()
                moveTo(252.49f, 136.49f)
                lineTo(220.49f, 168.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 0.0f)
                lineToRelative(-16.0f, -16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineTo(212.0f, 143.0f)
                lineToRelative(23.51f, -23.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 17.0f, 17.0f)
                close()
            }
        }
        .build()
        return _usercheck!!
    }

private var _usercheck: ImageVector? = null
