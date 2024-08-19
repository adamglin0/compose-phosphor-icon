package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Bracketscurly: ImageVector
    get() {
        if (_bracketscurly != null) {
            return _bracketscurly!!
        }
        _bracketscurly = Builder(name = "Bracketscurly", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(35.89f, 128.0f)
                curveTo(52.0f, 136.23f, 52.0f, 155.64f, 52.0f, 172.0f)
                curveToRelative(0.0f, 24.8f, 1.35f, 40.0f, 28.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                curveToRelative(-36.0f, 0.0f, -36.0f, -26.61f, -36.0f, -48.0f)
                curveToRelative(0.0f, -24.8f, -1.35f, -40.0f, -28.0f, -40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                curveToRelative(26.65f, 0.0f, 28.0f, -15.2f, 28.0f, -40.0f)
                curveToRelative(0.0f, -21.39f, 0.0f, -48.0f, 36.0f, -48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                curveTo(53.35f, 44.0f, 52.0f, 59.2f, 52.0f, 84.0f)
                curveTo(52.0f, 100.36f, 52.0f, 119.77f, 35.89f, 128.0f)
                close()
                moveTo(240.0f, 124.0f)
                curveToRelative(-26.65f, 0.0f, -28.0f, -15.2f, -28.0f, -40.0f)
                curveToRelative(0.0f, -21.39f, 0.0f, -48.0f, -36.0f, -48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                curveToRelative(26.65f, 0.0f, 28.0f, 15.2f, 28.0f, 40.0f)
                curveToRelative(0.0f, 16.36f, 0.0f, 35.77f, 16.11f, 44.0f)
                curveTo(204.0f, 136.23f, 204.0f, 155.64f, 204.0f, 172.0f)
                curveToRelative(0.0f, 24.8f, -1.35f, 40.0f, -28.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                curveToRelative(36.0f, 0.0f, 36.0f, -26.61f, 36.0f, -48.0f)
                curveToRelative(0.0f, -24.8f, 1.35f, -40.0f, 28.0f, -40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
            }
        }
        .build()
        return _bracketscurly!!
    }

private var _bracketscurly: ImageVector? = null
