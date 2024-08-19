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

public val BoldGroup.Lectern: ImageVector
    get() {
        if (_lectern != null) {
            return _lectern!!
        }
        _lectern = Builder(name = "Lectern", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(249.87f, 119.06f)
                lineToRelative(-40.0f, -80.0f)
                arcTo(19.89f, 19.89f, 0.0f, false, false, 192.0f, 28.0f)
                horizontalLineTo(64.0f)
                arcTo(19.89f, 19.89f, 0.0f, false, false, 46.13f, 39.06f)
                lineToRelative(-40.0f, 80.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 24.0f, 148.0f)
                horizontalLineToRelative(92.0f)
                verticalLineToRelative(56.0f)
                horizontalLineTo(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineTo(140.0f)
                verticalLineTo(148.0f)
                horizontalLineToRelative(92.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 17.89f, -28.94f)
                close()
                moveTo(30.49f, 124.0f)
                lineToRelative(36.0f, -72.0f)
                horizontalLineToRelative(123.0f)
                lineToRelative(36.0f, 72.0f)
                close()
                moveTo(192.0f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineTo(76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineTo(180.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 192.0f, 100.0f)
                close()
            }
        }
        .build()
        return _lectern!!
    }

private var _lectern: ImageVector? = null
