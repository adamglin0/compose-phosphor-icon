package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Pentagram: ImageVector
    get() {
        if (_pentagram != null) {
            return _pentagram!!
        }
        _pentagram = Builder(name = "Pentagram", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(239.18f, 91.05f)
                arcTo(15.75f, 15.75f, 0.0f, false, false, 224.0f, 80.0f)
                horizontalLineToRelative(-61.0f)
                lineTo(143.23f, 19.26f)
                arcToRelative(15.93f, 15.93f, 0.0f, false, false, -30.45f, -0.05f)
                lineTo(93.06f, 80.0f)
                lineTo(32.0f, 80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -9.37f, 29.0f)
                lineToRelative(49.46f, 35.58f)
                lineTo(53.15f, 203.0f)
                arcTo(15.75f, 15.75f, 0.0f, false, false, 59.0f, 220.88f)
                arcToRelative(15.74f, 15.74f, 0.0f, false, false, 18.77f, 0.0f)
                lineTo(128.0f, 184.75f)
                lineToRelative(50.23f, 36.13f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 202.85f, 203.0f)
                lineToRelative(-19.0f, -58.46f)
                lineToRelative(49.49f, -35.61f)
                arcTo(15.74f, 15.74f, 0.0f, false, false, 239.18f, 91.05f)
                close()
                moveTo(128.0f, 24.15f)
                lineTo(146.12f, 80.0f)
                lineTo(109.88f, 80.0f)
                close()
                moveTo(32.0f, 96.0f)
                lineTo(87.87f, 96.0f)
                lineTo(77.3f, 128.56f)
                close()
                moveTo(68.34f, 208.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(17.39f, -53.59f)
                lineToRelative(28.54f, 20.54f)
                close()
                moveTo(90.91f, 138.43f)
                lineTo(104.69f, 96.0f)
                horizontalLineToRelative(46.62f)
                lineToRelative(13.75f, 42.38f)
                lineTo(128.0f, 165.0f)
                close()
                moveTo(187.6f, 208.0f)
                lineTo(187.6f, 208.0f)
                lineTo(141.7f, 175.0f)
                lineTo(170.24f, 154.46f)
                close()
                moveTo(178.67f, 128.62f)
                lineTo(168.13f, 96.0f)
                lineTo(224.0f, 96.0f)
                close()
            }
        }
        .build()
        return _pentagram!!
    }

private var _pentagram: ImageVector? = null
