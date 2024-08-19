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

public val BoldGroup.Unite: ImageVector
    get() {
        if (_unite != null) {
            return _unite!!
        }
        _unite = Builder(name = "Unite", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(178.0f, 78.0f)
                arcTo(84.0f, 84.0f, 0.0f, true, false, 78.0f, 178.0f)
                arcTo(84.0f, 84.0f, 0.0f, true, false, 178.0f, 78.0f)
                close()
                moveTo(220.0f, 160.0f)
                arcToRelative(60.75f, 60.75f, 0.0f, false, true, -0.38f, 6.65f)
                lineToRelative(-44.0f, -44.0f)
                arcToRelative(83.31f, 83.31f, 0.0f, false, false, 4.0f, -19.34f)
                arcTo(60.09f, 60.09f, 0.0f, false, true, 220.0f, 160.0f)
                close()
                moveTo(146.0f, 129.06f)
                lineTo(126.94f, 110.0f)
                arcToRelative(59.57f, 59.57f, 0.0f, false, true, 28.9f, -9.81f)
                arcTo(59.57f, 59.57f, 0.0f, false, true, 146.0f, 129.06f)
                close()
                moveTo(110.0f, 126.94f)
                lineTo(129.06f, 146.0f)
                arcToRelative(59.57f, 59.57f, 0.0f, false, true, -28.9f, 9.81f)
                arcTo(59.57f, 59.57f, 0.0f, false, true, 110.0f, 126.94f)
                close()
                moveTo(152.7f, 76.34f)
                arcToRelative(83.31f, 83.31f, 0.0f, false, false, -19.34f, 4.0f)
                lineToRelative(-44.0f, -44.0f)
                arcTo(60.75f, 60.75f, 0.0f, false, true, 96.0f, 36.0f)
                arcTo(60.09f, 60.09f, 0.0f, false, true, 152.67f, 76.34f)
                close()
                moveTo(64.19f, 45.16f)
                lineToRelative(46.73f, 46.73f)
                arcToRelative(85.0f, 85.0f, 0.0f, false, false, -19.0f, 19.0f)
                lineTo(45.16f, 64.19f)
                arcTo(60.45f, 60.45f, 0.0f, false, true, 64.19f, 45.16f)
                close()
                moveTo(36.0f, 96.0f)
                arcToRelative(60.75f, 60.75f, 0.0f, false, true, 0.38f, -6.65f)
                lineToRelative(44.0f, 44.0f)
                arcToRelative(83.31f, 83.31f, 0.0f, false, false, -4.0f, 19.34f)
                arcTo(60.09f, 60.09f, 0.0f, false, true, 36.0f, 96.0f)
                close()
                moveTo(103.33f, 179.66f)
                arcToRelative(83.31f, 83.31f, 0.0f, false, false, 19.34f, -4.0f)
                lineToRelative(44.0f, 44.0f)
                arcTo(60.75f, 60.75f, 0.0f, false, true, 160.0f, 220.0f)
                arcTo(60.09f, 60.09f, 0.0f, false, true, 103.33f, 179.66f)
                close()
                moveTo(191.81f, 210.84f)
                lineTo(145.08f, 164.11f)
                arcToRelative(85.0f, 85.0f, 0.0f, false, false, 19.0f, -19.0f)
                lineToRelative(46.73f, 46.73f)
                arcTo(60.45f, 60.45f, 0.0f, false, true, 191.81f, 210.84f)
                close()
            }
        }
        .build()
        return _unite!!
    }

private var _unite: ImageVector? = null
