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

public val LightGroup.AngularLogo: ImageVector
    get() {
        if (_angularLogo != null) {
            return _angularLogo!!
        }
        _angularLogo = Builder(name = "AngularLogo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.31f, 66.46f)
                lineToRelative(-96.0f, -40.0f)
                arcToRelative(6.06f, 6.06f, 0.0f, false, false, -4.62f, 0.0f)
                lineToRelative(-96.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.64f, 6.33f)
                lineToRelative(16.0f, 120.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.27f, 4.58f)
                lineToRelative(80.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.36f, 0.0f)
                lineToRelative(80.0f, -40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.27f, -4.58f)
                lineToRelative(16.0f, -120.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 226.31f, 66.46f)
                close()
                moveTo(202.47f, 188.06f)
                lineTo(128.0f, 225.29f)
                lineTo(53.53f, 188.06f)
                lineToRelative(-15.0f, -112.29f)
                lineTo(128.0f, 38.5f)
                lineToRelative(89.44f, 37.27f)
                close()
                moveTo(122.75f, 85.06f)
                lineTo(82.75f, 157.06f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 10.5f, 5.82f)
                lineTo(104.86f, 142.0f)
                horizontalLineToRelative(46.28f)
                lineToRelative(11.61f, 20.91f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 168.0f, 166.0f)
                arcToRelative(5.88f, 5.88f, 0.0f, false, false, 2.9f, -0.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.34f, -8.15f)
                lineToRelative(-40.0f, -72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.5f, 0.0f)
                close()
                moveTo(144.47f, 130.0f)
                lineTo(111.53f, 130.0f)
                lineTo(128.0f, 100.35f)
                close()
            }
        }
        .build()
        return _angularLogo!!
    }

private var _angularLogo: ImageVector? = null
