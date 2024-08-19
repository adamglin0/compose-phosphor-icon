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

public val LightGroup.Nut: ImageVector
    get() {
        if (_nut != null) {
            return _nut!!
        }
        _nut = Builder(name = "Nut", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 82.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, false, 46.0f, 46.0f)
                arcTo(46.06f, 46.06f, 0.0f, false, false, 128.0f, 82.0f)
                close()
                moveTo(128.0f, 162.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, true, 34.0f, -34.0f)
                arcTo(34.0f, 34.0f, 0.0f, false, true, 128.0f, 162.0f)
                close()
                moveTo(222.72f, 67.91f)
                lineTo(134.72f, 19.73f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, -13.44f, 0.0f)
                lineToRelative(-88.0f, 48.18f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 80.18f)
                verticalLineToRelative(95.64f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 7.28f, 12.27f)
                lineToRelative(88.0f, 48.18f)
                arcToRelative(13.92f, 13.92f, 0.0f, false, false, 13.44f, 0.0f)
                lineToRelative(88.0f, -48.18f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 230.0f, 175.82f)
                lineTo(230.0f, 80.18f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 222.72f, 67.91f)
                close()
                moveTo(218.0f, 175.82f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.0f, 1.75f)
                lineToRelative(-88.0f, 48.18f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.92f, 0.0f)
                lineTo(39.0f, 177.57f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.0f, -1.75f)
                lineTo(38.0f, 80.18f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.0f, -1.75f)
                lineToRelative(88.0f, -48.18f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.92f, 0.0f)
                lineToRelative(88.0f, 48.18f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.0f, 1.75f)
                close()
            }
        }
        .build()
        return _nut!!
    }

private var _nut: ImageVector? = null
