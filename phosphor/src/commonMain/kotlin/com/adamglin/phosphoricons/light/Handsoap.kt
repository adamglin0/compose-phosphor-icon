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

public val LightGroup.Handsoap: ImageVector
    get() {
        if (_handsoap != null) {
            return _handsoap!!
        }
        _handsoap = Builder(name = "Handsoap", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(182.0f, 98.48f)
                lineTo(182.0f, 88.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -30.0f, -30.0f)
                lineTo(134.0f, 58.0f)
                lineTo(134.0f, 30.0f)
                horizontalLineToRelative(34.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, 10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -22.0f, -22.0f)
                lineTo(104.0f, 18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(18.0f)
                lineTo(122.0f, 58.0f)
                lineTo(104.0f, 58.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 74.0f, 88.0f)
                lineTo(74.0f, 98.48f)
                arcTo(38.05f, 38.05f, 0.0f, false, false, 42.0f, 136.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(200.0f, 230.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(214.0f, 136.0f)
                arcTo(38.05f, 38.05f, 0.0f, false, false, 182.0f, 98.48f)
                close()
                moveTo(104.0f, 70.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 18.0f, 18.0f)
                lineTo(170.0f, 98.0f)
                lineTo(86.0f, 98.0f)
                lineTo(86.0f, 88.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 104.0f, 70.0f)
                close()
                moveTo(202.0f, 216.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(56.0f, 218.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(54.0f, 136.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 26.0f, -26.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 26.0f, 26.0f)
                close()
            }
        }
        .build()
        return _handsoap!!
    }

private var _handsoap: ImageVector? = null
