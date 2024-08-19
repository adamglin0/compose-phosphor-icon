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

public val BoldGroup.Numberthree: ImageVector
    get() {
        if (_numberthree != null) {
            return _numberthree!!
        }
        _numberthree = Builder(name = "Numberthree", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.0f, 160.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 80.0f, 204.72f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 16.0f, -17.88f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 120.0f, 124.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -9.6f, -19.2f)
                lineTo(144.0f, 60.0f)
                horizontalLineTo(88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 9.6f, 19.2f)
                lineToRelative(-36.48f, 48.64f)
                arcTo(60.11f, 60.11f, 0.0f, false, true, 180.0f, 160.0f)
                close()
            }
        }
        .build()
        return _numberthree!!
    }

private var _numberthree: ImageVector? = null
