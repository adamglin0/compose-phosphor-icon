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

public val BoldGroup.LinkSimple: ImageVector
    get() {
        if (_linkSimple != null) {
            return _linkSimple!!
        }
        _linkSimple = Builder(name = "LinkSimple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(87.5f, 151.52f)
                lineToRelative(64.0f, -64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                lineToRelative(-64.0f, 64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                close()
                moveTo(218.5f, 37.52f)
                arcToRelative(60.08f, 60.08f, 0.0f, false, false, -84.87f, 0.0f)
                lineTo(103.51f, 67.61f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 17.0f)
                lineToRelative(30.07f, -30.06f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 50.93f, 50.92f)
                lineTo(171.4f, 135.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 17.0f, 17.0f)
                lineToRelative(30.08f, -30.06f)
                arcTo(60.09f, 60.09f, 0.0f, false, false, 218.45f, 37.55f)
                close()
                moveTo(135.52f, 171.4f)
                lineToRelative(-30.07f, 30.08f)
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
        return _linkSimple!!
    }

private var _linkSimple: ImageVector? = null
