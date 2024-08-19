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

public val BoldGroup.Linksimplebreak: ImageVector
    get() {
        if (_linksimplebreak != null) {
            return _linksimplebreak!!
        }
        _linksimplebreak = Builder(name = "Linksimplebreak", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(218.45f, 122.43f)
                lineToRelative(-30.08f, 30.06f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineToRelative(30.08f, -30.07f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -50.93f, -50.92f)
                lineTo(120.48f, 84.59f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineToRelative(30.07f, -30.06f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, 84.87f, 84.88f)
                close()
                moveTo(135.52f, 171.43f)
                lineTo(105.45f, 201.51f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -50.92f, -50.93f)
                lineToRelative(30.06f, -30.07f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f)
                lineTo(37.55f, 133.58f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, 84.88f, 84.87f)
                lineToRelative(30.06f, -30.07f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f)
                close()
            }
        }
        .build()
        return _linksimplebreak!!
    }

private var _linksimplebreak: ImageVector? = null
