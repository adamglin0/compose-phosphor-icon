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

public val LightGroup.Hamburger: ImageVector
    get() {
        if (_hamburger != null) {
            return _hamburger!!
        }
        _hamburger = Builder(name = "Hamburger", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.07f, 102.0f)
                lineTo(207.93f, 102.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 13.76f, -17.0f)
                curveTo(214.45f, 50.83f, 175.05f, 26.0f, 128.0f, 26.0f)
                reflectiveCurveTo(41.55f, 50.83f, 34.31f, 85.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 13.76f, 17.0f)
                close()
                moveTo(46.07f, 87.52f)
                curveTo(52.0f, 59.29f, 87.25f, 38.0f, 128.0f, 38.0f)
                reflectiveCurveTo(204.0f, 59.29f, 210.0f, 87.52f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.48f)
                lineTo(48.07f, 90.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.48f)
                close()
                moveTo(230.0f, 154.36f)
                lineTo(188.1f, 169.58f)
                lineToRelative(-37.87f, -15.15f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.46f, 0.0f)
                lineTo(108.0f, 169.54f)
                lineTo(70.23f, 154.43f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.28f, -0.07f)
                lineToRelative(-44.0f, 16.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 24.0f, 182.0f)
                arcToRelative(6.11f, 6.11f, 0.0f, false, false, 2.05f, -0.36f)
                lineToRelative(16.0f, -5.8f)
                lineTo(42.05f, 184.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 38.0f, 38.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 38.0f, -38.0f)
                lineTo(214.05f, 172.93f)
                lineToRelative(20.05f, -7.29f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.1f, -11.28f)
                close()
                moveTo(202.0f, 184.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -26.0f, 26.0f)
                lineTo(80.0f, 210.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -26.0f, -26.0f)
                lineTo(54.0f, 171.48f)
                lineToRelative(13.9f, -5.06f)
                lineToRelative(37.87f, 15.15f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.46f, 0.0f)
                lineTo(148.0f, 166.46f)
                lineToRelative(37.77f, 15.11f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.28f, 0.07f)
                lineTo(202.0f, 177.29f)
                close()
                moveTo(18.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                lineTo(232.0f, 122.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(24.0f, 134.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 18.0f, 128.0f)
                close()
            }
        }
        .build()
        return _hamburger!!
    }

private var _hamburger: ImageVector? = null
