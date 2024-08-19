package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Hamburger: ImageVector
    get() {
        if (_hamburger != null) {
            return _hamburger!!
        }
        _hamburger = Builder(name = "Hamburger", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(35.58f, 98.06f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -3.23f, -13.44f)
                curveTo(39.78f, 49.5f, 80.0f, 24.0f, 128.0f, 24.0f)
                reflectiveCurveToRelative(88.22f, 25.5f, 95.65f, 60.62f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 207.93f, 104.0f)
                lineTo(48.07f, 104.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 35.58f, 98.06f)
                close()
                moveTo(229.26f, 152.48f)
                lineTo(188.13f, 167.48f)
                lineTo(151.0f, 152.57f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.94f, 0.0f)
                lineToRelative(-37.0f, 14.81f)
                lineTo(71.0f, 152.57f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.7f, -0.09f)
                lineToRelative(-44.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.47f, 15.0f)
                lineTo(40.0f, 178.69f)
                lineTo(40.0f, 184.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, 40.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, -40.0f)
                verticalLineToRelative(-9.67f)
                lineToRelative(18.73f, -6.81f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -5.47f, -15.0f)
                close()
                moveTo(24.0f, 136.0f)
                lineTo(232.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(24.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                close()
            }
        }
        .build()
        return _hamburger!!
    }

private var _hamburger: ImageVector? = null
