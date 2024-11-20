package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.LinkSimple: ImageVector
    get() {
        if (_linkSimple != null) {
            return _linkSimple!!
        }
        _linkSimple = Builder(name = "LinkSimple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(209.94f, 113.94f)
                lineToRelative(-96.0f, 96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -67.88f, -67.88f)
                lineToRelative(96.0f, -96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 67.88f, 67.88f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(165.66f, 90.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.32f)
                lineToRelative(-64.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineToRelative(64.0f, -64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 165.66f, 90.34f)
                close()
                moveTo(215.6f, 40.4f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, -79.2f, 0.0f)
                lineTo(106.34f, 70.45f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f)
                lineToRelative(30.06f, -30.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 56.57f, 56.56f)
                lineToRelative(-30.07f, 30.06f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.31f, 11.32f)
                lineTo(215.6f, 119.6f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 0.0f, -79.2f)
                close()
                moveTo(138.34f, 174.22f)
                lineToRelative(-30.06f, 30.06f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, -56.56f, -56.57f)
                lineToRelative(30.05f, -30.05f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.32f)
                lineTo(40.4f, 136.4f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 79.2f, 79.2f)
                lineToRelative(30.06f, -30.07f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.31f)
                close()
            }
        }
        .build()
        return _linkSimple!!
    }

private var _linkSimple: ImageVector? = null
