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

public val BoldGroup.ListStar: ImageVector
    get() {
        if (_listStar != null) {
            return _listStar!!
        }
        _listStar = Builder(name = "ListStar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(28.0f, 64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 40.0f, 52.0f)
                lineTo(216.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(40.0f, 76.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 28.0f, 64.0f)
                close()
                moveTo(40.0f, 140.0f)
                lineTo(88.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(40.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                close()
                moveTo(104.0f, 180.0f)
                lineTo(40.0f, 180.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(239.64f, 146.87f)
                lineTo(219.06f, 163.87f)
                lineTo(225.31f, 189.13f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.73f, 13.22f)
                lineTo(184.0f, 188.46f)
                lineToRelative(-23.58f, 13.88f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.73f, -13.22f)
                lineToRelative(6.25f, -25.26f)
                lineToRelative(-20.58f, -17.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 6.72f, -21.22f)
                lineToRelative(27.42f, -2.12f)
                lineTo(173.0f, 99.25f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 22.0f, 0.0f)
                lineToRelative(10.48f, 24.28f)
                lineToRelative(27.42f, 2.12f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 6.72f, 21.22f)
                close()
                moveTo(201.43f, 147.29f)
                lineTo(196.43f, 146.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -10.09f, -7.21f)
                lineToRelative(-2.33f, -5.4f)
                lineToRelative(-2.33f, 5.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -10.1f, 7.21f)
                lineToRelative(-5.0f, 0.39f)
                lineToRelative(3.48f, 2.87f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 4.0f, 12.13f)
                lineToRelative(-1.21f, 4.89f)
                lineToRelative(5.07f, -3.0f)
                arcToRelative(12.06f, 12.06f, 0.0f, false, true, 12.18f, 0.0f)
                lineToRelative(5.07f, 3.0f)
                lineTo(194.0f, 162.29f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 4.0f, -12.13f)
                close()
            }
        }
        .build()
        return _listStar!!
    }

private var _listStar: ImageVector? = null
