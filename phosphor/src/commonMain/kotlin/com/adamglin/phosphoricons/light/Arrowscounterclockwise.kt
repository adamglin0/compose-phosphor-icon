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

public val LightGroup.Arrowscounterclockwise: ImageVector
    get() {
        if (_arrowscounterclockwise != null) {
            return _arrowscounterclockwise!!
        }
        _arrowscounterclockwise = Builder(name = "Arrowscounterclockwise", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.0f, 102.0f)
                lineTo(40.0f, 102.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, -6.0f)
                lineTo(34.0f, 48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                lineTo(46.0f, 81.52f)
                lineToRelative(18.0f, -18.0f)
                arcToRelative(93.45f, 93.45f, 0.0f, false, true, 66.0f, -27.53f)
                horizontalLineToRelative(0.52f)
                arcTo(93.39f, 93.39f, 0.0f, false, true, 196.19f, 62.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.38f, 8.58f)
                arcTo(82.0f, 82.0f, 0.0f, false, false, 72.53f, 72.0f)
                lineTo(54.48f, 90.0f)
                lineTo(88.0f, 90.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                close()
                moveTo(216.0f, 154.0f)
                lineTo(168.0f, 154.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(33.52f)
                lineToRelative(-18.05f, 18.0f)
                arcToRelative(81.51f, 81.51f, 0.0f, false, true, -57.53f, 24.0f)
                horizontalLineToRelative(-0.46f)
                arcToRelative(81.5f, 81.5f, 0.0f, false, true, -57.29f, -23.34f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.38f, 8.58f)
                arcToRelative(93.39f, 93.39f, 0.0f, false, false, 65.67f, 26.76f)
                lineTo(126.0f, 220.0f)
                arcToRelative(93.45f, 93.45f, 0.0f, false, false, 66.0f, -27.53f)
                lineToRelative(18.0f, -18.05f)
                lineTo(210.0f, 208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(222.0f, 160.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 216.0f, 154.0f)
                close()
            }
        }
        .build()
        return _arrowscounterclockwise!!
    }

private var _arrowscounterclockwise: ImageVector? = null
