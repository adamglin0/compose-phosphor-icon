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

public val FillGroup.Arrowscounterclockwise: ImageVector
    get() {
        if (_arrowscounterclockwise != null) {
            return _arrowscounterclockwise!!
        }
        _arrowscounterclockwise = Builder(name = "Arrowscounterclockwise", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.0f, 104.0f)
                lineTo(40.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(32.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.66f, -5.66f)
                lineTo(64.0f, 60.7f)
                arcToRelative(95.42f, 95.42f, 0.0f, false, true, 66.0f, -26.76f)
                horizontalLineToRelative(0.53f)
                arcToRelative(95.36f, 95.36f, 0.0f, false, true, 67.07f, 27.33f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.18f, 11.44f)
                arcToRelative(79.52f, 79.52f, 0.0f, false, false, -55.89f, -22.77f)
                horizontalLineToRelative(-0.45f)
                arcTo(79.48f, 79.48f, 0.0f, false, false, 75.35f, 72.0f)
                lineTo(93.66f, 90.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 88.0f, 104.0f)
                close()
                moveTo(216.0f, 152.0f)
                lineTo(168.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.66f, 13.66f)
                lineTo(180.65f, 184.0f)
                arcToRelative(79.48f, 79.48f, 0.0f, false, true, -54.72f, 22.09f)
                horizontalLineToRelative(-0.45f)
                arcToRelative(79.52f, 79.52f, 0.0f, false, true, -55.89f, -22.77f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -11.18f, 11.44f)
                arcToRelative(95.36f, 95.36f, 0.0f, false, false, 67.07f, 27.33f)
                lineTo(126.0f, 222.09f)
                arcToRelative(95.42f, 95.42f, 0.0f, false, false, 66.0f, -26.76f)
                lineToRelative(18.36f, 18.36f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 208.0f)
                lineTo(224.0f, 160.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 152.0f)
                close()
            }
        }
        .build()
        return _arrowscounterclockwise!!
    }

private var _arrowscounterclockwise: ImageVector? = null
