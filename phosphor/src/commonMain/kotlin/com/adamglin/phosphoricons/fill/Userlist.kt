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

public val FillGroup.Userlist: ImageVector
    get() {
        if (_userlist != null) {
            return _userlist!!
        }
        _userlist = Builder(name = "Userlist", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(160.0f, 88.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 152.0f, 80.0f)
                close()
                moveTo(248.0f, 120.0f)
                lineTo(160.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(248.0f, 168.0f)
                lineTo(184.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(109.29f, 142.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, -58.58f, 0.0f)
                curveToRelative(-20.62f, 8.73f, -36.87f, 26.3f, -42.46f, 48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 16.0f, 200.0f)
                lineTo(144.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.75f, -10.0f)
                curveTo(146.16f, 168.29f, 129.91f, 150.72f, 109.29f, 142.0f)
                close()
            }
        }
        .build()
        return _userlist!!
    }

private var _userlist: ImageVector? = null
