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

public val BoldGroup.Flask: ImageVector
    get() {
        if (_flask != null) {
            return _flask!!
        }
        _flask = Builder(name = "Flask", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.15f, 197.71f)
                lineTo(164.0f, 95.81f)
                verticalLineTo(44.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineTo(88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(95.81f)
                lineTo(30.85f, 197.71f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 48.0f, 228.0f)
                horizontalLineTo(208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 17.15f, -30.29f)
                close()
                moveTo(140.0f, 44.0f)
                verticalLineTo(99.14f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 1.71f, 6.17f)
                lineToRelative(35.13f, 58.54f)
                curveToRelative(-10.79f, 0.86f, -25.15f, -1.31f, -43.42f, -10.56f)
                curveToRelative(-14.0f, -7.08f, -27.46f, -11.33f, -40.27f, -12.76f)
                lineToRelative(21.14f, -35.22f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 116.0f, 99.14f)
                verticalLineTo(44.0f)
                close()
                moveTo(55.06f, 204.0f)
                lineTo(79.0f, 164.19f)
                curveToRelative(13.0f, -1.11f, 27.62f, 2.42f, 43.62f, 10.52f)
                curveToRelative(19.61f, 9.92f, 36.25f, 13.31f, 49.85f, 13.31f)
                arcTo(75.44f, 75.44f, 0.0f, false, false, 190.11f, 186.0f)
                lineToRelative(10.83f, 18.0f)
                close()
            }
        }
        .build()
        return _flask!!
    }

private var _flask: ImageVector? = null
